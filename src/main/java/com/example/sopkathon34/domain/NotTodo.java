package com.example.sopkathon34.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class NotTodo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notTodoId;

    private Long memberId;

    private int notTodoRanking;

    private String notTodoContent;

    private boolean notTodoIsChecked;
}
