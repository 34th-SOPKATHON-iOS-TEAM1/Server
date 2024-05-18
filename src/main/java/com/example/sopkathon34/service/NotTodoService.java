package com.example.sopkathon34.service;

import com.example.sopkathon34.domain.NotTodo;
import com.example.sopkathon34.dto.request.NotTodoCreateRequest;
import com.example.sopkathon34.repository.NotTodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotTodoService {

    private final NotTodoRepository notTodoRepository;

    public void createNotTodo(Long memberId, NotTodoCreateRequest notTodoCreateRequest) {
        for (String content : notTodoCreateRequest.notTodoContent()) {
            NotTodo notTodo = NotTodo.create(memberId, content, false);
            notTodoRepository.save(notTodo);
        }
    }
}
