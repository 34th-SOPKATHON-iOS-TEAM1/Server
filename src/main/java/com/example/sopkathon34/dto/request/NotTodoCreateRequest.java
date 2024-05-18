package com.example.sopkathon34.dto.request;

import java.util.List;

public record NotTodoCreateRequest(
    List<String> notTodoContent
) {
}
