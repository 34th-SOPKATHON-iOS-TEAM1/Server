package com.example.sopkathon34.controller;

import com.example.sopkathon34.common.response.BaseResponse;
import com.example.sopkathon34.common.response.SuccessMessage;
import com.example.sopkathon34.dto.request.NotTodoCreateRequest;
import com.example.sopkathon34.service.NotTodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class NotTodoController {

    private final NotTodoService notTodoService;

    @PostMapping("/not-todo")
    public BaseResponse<Void> createNotTodo(
            @RequestHeader(name = "memberId") Long memberId,
            @RequestBody NotTodoCreateRequest notTodoCreateRequest
            ) {
        notTodoService.createNotTodo(memberId, notTodoCreateRequest);
        return BaseResponse.success(SuccessMessage.SUCCESS_NOT_TODO_CREATE);
    }
}
