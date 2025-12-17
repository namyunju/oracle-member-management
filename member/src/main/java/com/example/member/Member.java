package com.example.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity // 이 클래스대로 DB에 테이블을 만들어라!
@Getter @Setter // Getter, Setter 메서드 자동 생성
public class Member {

    @Id // 이 데이터의 고유 번호 (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3... 자동 증가
    private Long id;

    @Column(unique = true) // 아이디는 중복될 수 없음
    private String userId;

    private String password;
    private String name;
}