package com.example.sopkathon34.controller;

import com.example.sopkathon34.common.response.BaseResponse;
import com.example.sopkathon34.common.response.SuccessMessage;
import com.example.sopkathon34.dto.request.NotTodoCreateRequest;
import com.example.sopkathon34.dto.response.MainViewGetResponse;
import com.example.sopkathon34.service.NotTodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class NotTodoController {

    private final NotTodoService notTodoService;

    @PostMapping("/not-todo")
    @Operation(summary = "not-to-do 생성")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "201", description = "NotTodo added successfully")
            })
    public BaseResponse<Void> createNotTodo(
            @RequestHeader Long memberId,
            @RequestBody NotTodoCreateRequest notTodoCreateRequest
            ) {
        notTodoService.createNotTodo(memberId, notTodoCreateRequest);
        return BaseResponse.success(SuccessMessage.SUCCESS_NOT_TODO_CREATE);
    }

    @GetMapping("/all")
    @Operation(summary = "모든 뷰 조회")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Get information successfully")
            })
    public BaseResponse<MainViewGetResponse> getAllView(
            @RequestHeader Long memberId
    ) {
        MainViewGetResponse mainViewGetResponse = notTodoService.getAllView(memberId);
        return BaseResponse.success(SuccessMessage.SUCCESS_GET_ALL_LIST, mainViewGetResponse);
    }
}
