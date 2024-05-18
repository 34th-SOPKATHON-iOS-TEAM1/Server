package com.example.sopkathon34.controller;

import com.example.sopkathon34.common.response.BaseResponse;
import com.example.sopkathon34.dto.request.NotTodoCreateRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public interface ControllerSwagger {

    @Operation(summary = "not-to-do 생성")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "201", description = "NotTodo added successfully")
            })
    BaseResponse<Void> createNotTodo(@RequestHeader Long memberId, @RequestBody NotTodoCreateRequest notTodoCreateRequest);
}
