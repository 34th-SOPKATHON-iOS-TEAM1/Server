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
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoId;

    private Long memberId;

    private String todoContent;

    private boolean todoIsChecked;

    @Builder
    public Todo(Long memberId, String todoContent, boolean todoIsChecked) {
        this.memberId = memberId;
        this.todoContent = todoContent;
        this.todoIsChecked = todoIsChecked;
    }

    public static Todo create(Long memberId, String todoContent, boolean todoIsChecked) {
        return Todo.builder()
                .memberId(memberId)
                .todoContent(todoContent)
                .todoIsChecked(todoIsChecked)
                .build();
    }
}
