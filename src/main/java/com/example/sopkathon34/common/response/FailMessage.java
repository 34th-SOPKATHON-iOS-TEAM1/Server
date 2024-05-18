package com.example.sopkathon34.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FailMessage {
    ;

    private final int status;
    private final String message;
}
