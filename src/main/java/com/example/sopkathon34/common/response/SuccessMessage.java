package com.example.sopkathon34.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessMessage {
    HEALTH_CHECK_SUCCESS("Health check success");

    private final String message;
}
