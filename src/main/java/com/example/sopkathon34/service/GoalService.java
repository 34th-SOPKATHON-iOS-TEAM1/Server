package com.example.sopkathon34.service;

import com.example.sopkathon34.domain.Goal;
import com.example.sopkathon34.dto.request.GoalCreateRequest;
import com.example.sopkathon34.repository.GoalRepository;
import java.lang.reflect.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoalService {

    private final GoalRepository goalRepository;

    public void createGoal(Long memberId, GoalCreateRequest goalCreatRequest){
        Goal goal = Goal.create(memberId,goalCreatRequest.goalContent());
        goalRepository.save(goal);
    }
}
