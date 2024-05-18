package com.example.sopkathon34.repository;

import com.example.sopkathon34.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
