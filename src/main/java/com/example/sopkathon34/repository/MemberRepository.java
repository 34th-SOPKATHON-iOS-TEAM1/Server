package com.example.sopkathon34.repository;

import com.example.sopkathon34.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
