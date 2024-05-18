package com.example.sopkathon34.dto.request;

import java.util.List;

public record TodoCreateRequest(
        List<String> todoContent
) {
}
