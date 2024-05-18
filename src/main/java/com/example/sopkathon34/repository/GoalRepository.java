package com.example.sopkathon34.repository;

import com.example.sopkathon34.domain.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {

    Goal findByMemberId(Long memberId);
}
