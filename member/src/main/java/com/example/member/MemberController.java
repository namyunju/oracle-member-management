package com.example.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    // 회원가입 화면 보여주기
    @GetMapping("/signup")
    public String signupForm() {
        return "signup";
    }

    // 가입 버튼 누르면 데이터 저장하기
    @PostMapping("/signup")
    public String signup(Member member) {
        memberRepository.save(member); // DB에 저장!
        return "redirect:/"; // 가입 끝나면 메인으로 이동
    }
}