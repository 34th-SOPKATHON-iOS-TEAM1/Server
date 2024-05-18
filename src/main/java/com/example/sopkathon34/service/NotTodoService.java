package com.example.sopkathon34.service;

import com.example.sopkathon34.domain.Goal;
import com.example.sopkathon34.domain.NotTodo;
import com.example.sopkathon34.domain.Todo;
import com.example.sopkathon34.dto.request.NotTodoCreateRequest;
import com.example.sopkathon34.dto.response.MainViewGetResponse;
import com.example.sopkathon34.repository.GoalRepository;
import com.example.sopkathon34.repository.NotTodoRepository;
import com.example.sopkathon34.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NotTodoService {

    private final NotTodoRepository notTodoRepository;
    private final GoalRepository goalRepository;
    private final TodoRepository TodoRepository;

    public void createNotTodo(Long memberId, NotTodoCreateRequest notTodoCreateRequest) {
        for (String content : notTodoCreateRequest.notTodoContent()) {
            NotTodo notTodo = NotTodo.create(memberId, content, false);
            notTodoRepository.save(notTodo);
        }
    }

    public MainViewGetResponse getAllView(Long memberId) {
        Goal goal = goalRepository.findByMemberId(memberId);
        List<NotTodo> notTodos = notTodoRepository.findByMemberId(memberId);
        List<String> notTodoContent = notTodos.stream()
                .map(NotTodo::getNotTodoContent)
                .toList();
        List<Todo> todos = TodoRepository.findByMemberId(memberId);
        List<String> todoContent = todos.stream()
                .map(Todo::getTodoContent)
                .toList();
        return new MainViewGetResponse(goal.getGoalContent(),todoContent,notTodoContent);
    }
}
