package com.example.sopkathon34.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Goal {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoId;

    private Long memberId;

    private String goalContent;

    @Builder
    public Goal(Long memberId, String goalContent) {
        this.memberId = memberId;
        this.goalContent = goalContent;
    }

    public static Goal create(Long memberId, String goalContent) {
        return Goal.builder()
                .memberId(memberId)
                .goalContent(goalContent)
                .build();
    }
}
