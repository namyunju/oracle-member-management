package com.example.member;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA가 대신 DB 저장 코드를 다 짜줍니다!
public interface MemberRepository extends JpaRepository<Member, Long> {
}