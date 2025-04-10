# Project : 만개의 칵테일
> **프로그래머스 데브코스 2기 - 2차 프로젝트 Team01** <br/> **개발기간: 2024.12.10 ~ 2025.1.6**

<div align="center">
<img width="700" alt="image" src="https://github.com/user-attachments/assets/db9b9745-a459-4b4c-8d5b-f9294dec0980">
</div>

<br/>

## 🎀 프로젝트 소개
- 만개의 칵테일은 사용자에게 지식 기반 칵테일 추천 및 레시피 검색 서비스를 제공하여 칵테일에 대한 접근성을 향상시킵니다.<br/>
- 칵테일에 대한 관심이 높아지고 있는 2030 세대의 소비 트렌드에 발맞추어, 방대한 종류로 인한 선택의 어려움을 해소하고자 지식 기반 추천 및 검색 서비스를 제공함으로써 진입 장벽을 낮추고 소비 경험을 향상시키고자 서비스를 기획하였습니다.

<br/>

## 👐 개발팀 구성
| [홍진웅](https://github.com/JinWoong9607) | [김휘연](https://github.com/joybully) | [이정은](https://github.com/Jeongeun0179)| [편재현](https://github.com/JaeHyunPyun) |
| --- | --- | --- | --- |
| <a href="https://github.com/JinWoong9607"><img src="https://avatars.githubusercontent.com/u/112241396?v=4" width="150px;" alt=""/></a> | <a href="https://github.com/joybully"><img src="https://avatars.githubusercontent.com/u/38284300?v=4" width="150px;" alt=""/></a> | <a href="https://github.com/Jeongeun0179"><img src="https://avatars.githubusercontent.com/u/141944850?v=4" width="150px;" alt=""/> | <a href="https://github.com/JaeHyunPyun"><img src="https://avatars.githubusercontent.com/u/179315815?v=4" width="150px;" alt=""/></a> |
| 팀장 | 팀원  | 팀원 | 팀원 |
| 관리자페이지 | 칵테일 지식 기반 추천 <br/> (Open-AI API 연동) | 사용자 인증, <br/> 회원정보 조회 | 칵테일 검색, <br/> 좋아요,즐겨찾기,댓글 |

<br/>

## 🛠️ 기술스택
### Environment
<img src="https://img.shields.io/badge/intellijidea-000000?style=for-the-badge&logo=intellijidea&logoColor=white"/> <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"> <img src="https://img.shields.io/badge/Github-181717?style=for-the-badge&logo=Github&logoColor=white">

### Development
<img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=Java&logoColor=white"> <img src="https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white">
<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white"> <img src="https://img.shields.io/badge/Spring Security-6DB33F?style=for-the-badge&logo=Spring Security&logoColor=white"> <br/>
<img src="https://img.shields.io/badge/Spring%20MVC-6DB33F.svg?&style=for-the-badge&logo=Spring&logoColor=white">
<img src="https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F.svg?&style=for-the-badge&logo=Hibernate&logoColor=white">
<img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=white"> <br/>
<img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=Thymeleaf&logoColor=white">
<img src="https://img.shields.io/badge/openai-412991?style=for-the-badge&logo=openai&logoColor=white">

### Communication
<img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white"/> <img src="https://img.shields.io/badge/slack-4A154B?style=for-the-badge&logo=slack&logoColor=white"/>

<br/>

## 🛠️ 화면구성
- <a href="https://www.youtube.com/watch?v=_Seb4n87FXQ">시연영상</a>

| 페이지명          | 주요 기능                                                                   | 화면 |
|---------------|-------------------------------------------------------------------------|------|
| 메인 페이지        | 오늘의 칵테일 추천  | <img width="600" src="https://github.com/user-attachments/assets/b989d019-6417-4394-ba49-f248f6d8e334"/> |
| 관리자 페이지       | 웹사이트 통계 조회, </br> 사용자 계정 정보 검색, </br> 관리자 권한 댓글 검색 및 삭제   | <img width="600" src="https://github.com/user-attachments/assets/e256f37c-7fdf-4b3a-815b-5750813e3e0b"/> |
| 사용자 인증        | ID 및 PW 기반 로그인, </br> 로그아웃, </br> 회원탈퇴, </br> 비밀번호 수정, </br> Kakao 소셜 로그인 | <img width="600" src="https://github.com/user-attachments/assets/85597c25-2c46-4f04-ac0f-49c6bc2f8c3c"/> |
| 마이 페이지        | 사용자 계정 및 즐겨찾기 정보 조회   | <img width="600" src="https://github.com/user-attachments/assets/f22c8344-b9df-4800-a023-aeb215b52482"/> |
| 인기 칵테일 추천     | 좋아요 기반 인기 칵테일 조회   | <img width="600" src="https://github.com/user-attachments/assets/22934aec-bcba-4305-95d5-2db0be75be1b"/> |
| 칵테일 추천        | Open-AI API를 활용한 지식 기반 추천   | <img width="600" src="https://github.com/user-attachments/assets/7fc9fdcc-98a2-456a-9c3c-3e6ab7e9b5c9"/> |
| 칵테일 검색        | 칵테일명 또는 재료 기반 검색, <br/> 조회수 또는 좋아요수 기반 인기 검색어 추천  | <img width="600" src="https://github.com/user-attachments/assets/4837d12b-2a65-4c68-bff1-34ffaf17cbcd"/> |
| 좋아요, 즐겨찾기, 댓글 | 좋아요, 즐겨찾기, 댓글 조회, 등록, 삭제   | <img width="600" src="https://github.com/user-attachments/assets/f2dde502-a4d0-41b6-9f23-d3f625f76634"/> |


## 📦 주요 기능
### 칵테일 추천 기능
- OpenAI API를 활용하여 간단한 취향 질문을 통해 사용자의 칵테일 및 술자리 선호를 파악한 뒤, 맞춤형 칵테일 추천
- 인증된 사용자의 '좋아요' 데이터를 기반으로 인기 칵테일 랭킹 제공

### 칵테일 검색 기능
- CocktailDB API를 활용하여 칵테일 이름 또는 재료 기반 검색 기능 제공
- 인증된 사용자의 '좋아요' 및 '즐겨찾기' 데이터를 기반으로 인기 검색어 추천

### 좋아요, 즐겨찾기, 댓글 기능
- 인증된 사용자의 '좋아요', '즐겨찾기' 및 '댓글' 등록 및 삭제 기능 제공
- '즐겨찾기'한 칵테일은 마이페이지에서 조회 가능

### 소셜 로그인
- 아이디 및 비밀번호 기반 인증 방식과 더불어 OAuth 2.0 인증을 통해 Kakao 소셜 로그인 기능 구현
- 사용자 정보를 세션에 저장하여 로그인 상태 유지

### 관리자 페이지 
- 전체 유저 목록 조회 및 특정 유저 삭제 기능 제공
- 유저 이메일 또는 이름 기준으로 특정 유저 검색 가능
- 전체 댓글 목록 조회 및 특정 댓글 삭제 기능 제공
- 댓글 내용 키워드를 활용한 댓글 검색 기능 지원
- 대시보드를 통해 인기 칵테일 TOP 3, 유저 및 조회수 및 댓글 증가율 등 주요 지표 시각화 및 통계 데이터 제공

## 🏗️ 아키텍처
### 프로젝트 아키텍처
<div align="center">
<img width="700" alt="image" src="https://github.com/user-attachments/assets/4021572d-60d0-42ce-978e-75dc94d05af3">
</div>

### ERD
<div align="center">
<img width="700" alt="image" src="https://github.com/user-attachments/assets/72a4cfb6-0f5a-43b7-8900-60763f0c1438">
</div>