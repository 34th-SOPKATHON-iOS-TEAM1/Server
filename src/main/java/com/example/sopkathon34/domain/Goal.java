package com.example.sopkathon34.domain;

import jakarta.persistence.*;
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
}
