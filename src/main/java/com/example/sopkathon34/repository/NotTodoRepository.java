package com.example.sopkathon34.repository;

import com.example.sopkathon34.domain.NotTodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotTodoRepository extends JpaRepository<NotTodo, Long> {
}
