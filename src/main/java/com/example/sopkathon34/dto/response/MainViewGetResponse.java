package com.example.sopkathon34.dto.response;

import com.example.sopkathon34.domain.NotTodo;

import java.util.List;

public record MainViewGetResponse(
        String goal,
        List<String> todoContent,
        List<String> notTodoContent
) {
}
