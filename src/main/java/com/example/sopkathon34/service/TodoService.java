package com.example.sopkathon34.service;

import com.example.sopkathon34.domain.Todo;
import com.example.sopkathon34.dto.request.TodoCreateRequest;
import com.example.sopkathon34.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public void createTodo(Long memberId, TodoCreateRequest todoCreateRequest) {
        for (String content : todoCreateRequest.todoContent()) {
            Todo todo = Todo.create(memberId, content, false);
            todoRepository.save(todo);
        }
    }
}
