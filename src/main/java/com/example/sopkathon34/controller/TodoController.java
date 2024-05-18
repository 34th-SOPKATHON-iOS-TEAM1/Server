package com.example.sopkathon34.controller;

import static com.example.sopkathon34.common.response.SuccessMessage.SUCCESS_TO_DO_CREATE;

import com.example.sopkathon34.common.response.BaseResponse;
import com.example.sopkathon34.dto.request.TodoCreateRequest;
import com.example.sopkathon34.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/todo")
    @Operation(summary = "to-do 등록 api")
    public BaseResponse<Void> todo(
            @RequestHeader Long memberId,
            @RequestBody TodoCreateRequest todoCreateRequest) {
        todoService.createTodo(memberId,todoCreateRequest);
        return BaseResponse.success(SUCCESS_TO_DO_CREATE);
    }
}
