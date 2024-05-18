package com.example.sopkathon34.controller;

import static com.example.sopkathon34.common.response.SuccessMessage.SUCCESS_GOAL_CREATE;

import com.example.sopkathon34.common.response.BaseResponse;
import com.example.sopkathon34.domain.Goal;
import com.example.sopkathon34.dto.request.GoalCreateRequest;
import com.example.sopkathon34.repository.GoalRepository;
import com.example.sopkathon34.service.GoalService;
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
public class GoalController {

    private final GoalService goalService;

    @PostMapping("/goal")
    @Operation(summary = "목표(0순위) 설정")
    public BaseResponse<Void> createGoal(
            @RequestHeader Long memberId,
            @RequestBody GoalCreateRequest goalCreateRequest) {
        goalService.createGoal(memberId,goalCreateRequest);
        return BaseResponse.success(SUCCESS_GOAL_CREATE);
    }
}
