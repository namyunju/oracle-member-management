# oracle-member-management

## 개요
Spring Boot와 Oracle 데이터베이스 기반 간단한 회원 관리 웹 애플리케이션

## 배경
- 본인은 python이 주언어로 django와 django ORM, Javascript, Vue 학습한 상태
- 목표로 하는 분야에서는 SpringBoot와 Oracle 사용하는 경우가 많음 
- 웹 서비스에서 고객 데이터 관리는 필수 역량

>> 고객 데이터 관리를 주제로 SpringBoot와 Oracle 실습

## 개인적 목표
- repository 생성부터 issue 작성, 프로젝트 진행, readme 작성까지 하나의 프로젝트 해보기
- branch 생성과 pull request 작성을 통한 협업 연습
- BackEnd와 FrontEnd의 상호 작용 이해 
- 데이터 베이스 활용 역량 강화
- JPA를 이용한 데이터 조회와 Thymeleaf 템플릿 출력 방식 익히기
- URL 매핑, 요청 처리 흐름 익히기

## 구현 기능

1. 회원 가입
- 사용자가 이름, 아이디, 비밀번호, 이메일 등을 입력
- 서버가 검증 후 DB에 저장
- 저장 시 비밀번호는 암호화

2. 로그인 / 로그아웃
- 로그인
    - 사용자가 아이디와 비밀번호 입력 시 DB의 데이터와 비교
    - 일치할 시 세션을 생성하고 로그인 상태를 유지 
    - 로그인 상태에 따라 화면 메뉴와 접근 권한이 달라지도록 구현

- 로그아웃
    - 로그아웃 시 세션 정보를 삭제
    - 인증 상태를 종료하고 로그인 페이지로 이동

3. 회원 목록 조회 (관리자 전용)
- 가입된 전체 회원 데이터를 DB에서 불러와 출력

4. 회원 정보 수정 / 삭제 (관리자 전용)
- 특정 회원 정보를 선택해 수정하고 이를 DB에 반영
- 회원 선택해 DB에서 안전하게 데이터 삭제


## 진행 방식 
- '처음 만드는 Java Spring + Oracle 회원 관리 미니 실습 노트' 도서 참고하여 진행 
- gemini 이용하여 프로젝트 구조 형성

## 개발 환경
- 운영 체제: Windows 10
- 개발 도구: Spring Tools for Eclipse
- JDK 버전 17 이상
- DBMS: Oracle Database 21c Express Edition

- 백엔드: Spring Boot, JPA, Oracle
- 프론트엔드: HTML5, CSS3, JavaScript
- 뷰 템플릿: Thymeleaf