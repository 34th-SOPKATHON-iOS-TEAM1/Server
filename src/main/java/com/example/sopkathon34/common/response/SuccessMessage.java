package com.example.sopkathon34.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessMessage {
    SUCCESS_NOT_TODO_CREATE(HttpStatus.CREATED.value(),"Not to do 등록 성공"),
    SUCCESS_GET_ALL_LIST(HttpStatus.OK.value(), "메인 뷰 전체 조회 성공"),
    SUCCESS_GOAL_CREATE(HttpStatus.CREATED.value(), "목표 설정 성공"),
    SUCCESS_TO_DO_CREATE(HttpStatus.CREATED.value(), "To do 등록 성공");

    private final int status;
    private final String message;
}
