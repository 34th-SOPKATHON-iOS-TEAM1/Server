package com.example.sopkathon34.repository;

import com.example.sopkathon34.domain.NotTodo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotTodoRepository extends JpaRepository<NotTodo, Long> {

    List<NotTodo> findByMemberId(Long memberId);
}
