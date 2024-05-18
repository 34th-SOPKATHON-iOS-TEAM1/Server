package com.example.sopkathon34.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class NotTodo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notTodoId;

    private Long memberId;

    private String notTodoContent;

    private boolean notTodoIsChecked;

    @Builder
    public NotTodo(Long memberId, String notTodoContent, boolean notTodoIsChecked) {
        this.memberId = memberId;
        this.notTodoContent = notTodoContent;
        this.notTodoIsChecked = notTodoIsChecked;
    }

    public static NotTodo create(Long memberId, String notTodoContent, boolean notTodoIsChecked) {
        return NotTodo.builder()
                .memberId(memberId)
                .notTodoContent(notTodoContent)
                .notTodoIsChecked(notTodoIsChecked)
                .build();
    }
}
