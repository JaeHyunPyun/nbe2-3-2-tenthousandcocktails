# Project : 만개의 칵테일
> **프로그래머스 데브코스 2기 - 2차 프로젝트 Team01** <br/> **개발기간: 2024.12.10 ~ 2025.1.6**

<div align="center">
<img width="700" alt="image" src="https://github.com/user-attachments/assets/0e490cde-3336-4297-b107-099cc836ce8e">
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
| 페이지명          | 주요 기능                                                                   | 화면 |
|---------------|-------------------------------------------------------------------------|------|
| 메인 페이지        | 오늘의 칵테일 추천                                                              | <img width="600" src="https://github.com/user-attachments/assets/449a15c6-b31a-444d-a3cb-a65017aec12c"/> |
| 관리자 페이지       | 웹사이트 통계 조회, </br> 사용자 계정 정보 검색, </br> 관리자 권한 댓글 검색 및 삭제                 | <img width="600" src="https://github.com/user-attachments/assets/c7d65616-9fce-4cb8-a3d2-777783e080b5"/> |
| 사용자 인증        | ID 및 PW 기반 로그인, </br> 로그아웃, </br> 회원탈퇴, </br> 비밀번호 수정, </br> Kakao 소셜 로그인 | <img width="600" src="https://github.com/user-attachments/assets/8b66ace3-f832-4eb4-9874-adf1b41c75da"/> |
| 마이 페이지        | 사용자 계정 및 즐겨찾기 정보 조회   | <img width="600" src="https://github.com/user-attachments/assets/3d8866f2-7d32-472f-b79d-6a0893835bd9"/> |
| 인기 칵테일 추천     | 좋아요 기반 인기 칵테일 조회   | <img width="600" src="https://github.com/user-attachments/assets/2aa50794-faae-4552-88ec-a9604646abdb"/> |
| 칵테일 추천        | Open-AI API를 활용한 지식 기반 추천   | <img width="600" src="https://github.com/user-attachments/assets/2a966877-6168-4a72-ad41-84fbd0d1bcaa"/> |
| 칵테일 검색        | 칵테일명 또는 재료 기반 검색, <br/> 조회수 또는 좋아요수 기반 인기 검색어 추천  | <img width="600" src="https://github.com/user-attachments/assets/4837d12b-2a65-4c68-bff1-34ffaf17cbcd"/> |
| 좋아요, 즐겨찾기, 댓글 | 좋아요, 즐겨찾기, 댓글 조회, 등록, 삭제   | <img width="600" src="https://github.com/user-attachments/assets/f2dde502-a4d0-41b6-9f23-d3f625f76634"/> |


##  프로젝트 개요
- **칵테일 추천**: 지식 기반 칵테일 추천(질문/답변), 인기 칵테일 추천
- **칵테일 검색**: 칵테일 이름 또는 재료 기반 검색, 조회수 또는 좋아요수 기반 인기 검색어 추천
- **좋아요, 즐겨찾기 기능**: 좋아요 및 즐겨찾기 기반 사용자 선호 데이터 수집
- **댓글 등록, 삭제 기능**: 댓글을 통한 기본적인 커뮤니티 기능 제공
- **소셜 로그인**: Kakao를 통한 간편 로그인
- **관리자 기능**: 유저 정보 조회 및 삭제, 유저 이메일 및 이름 검색, 댓글 검색 및 삭제



## Commit Message Convention

#### **type**
- feat: 새로운 기능 추가
- fix: 버그 수정
- docs: 문서 변경
- style: 코드 포맷 변경 (로직에 영향 없음)
- refactor: 코드 리팩토링
- test: 테스트 코드 추가/수정
- chore: 빌드 시스템 변경, 설정 파일 변경 등
- comment: 주석 추가/변경
- remove: 파일/폴더 삭제
- rename: 파일/폴더명 변경
- perf: 성능 개선

### 추가 설명
#### **body**

- 본문은 한 줄당 72자를 넘기지 않도록 작성합니다.
- 어떻게 변경했는지보다 **무엇**을 변경했는지 또는 **왜** 변경했는지를 설명합니다.
- 구체적이고 상세히 작성하며, 간결함을 유지합니다.

#### **footer**

- 여러 개의 이슈 번호를 작성할 때 쉼표로 구분합니다.
- `Fixes:`, `Resolves:`, `Related to:` 등 키워드를 활용합니다.
- 예시:
  - `Fixes: #45` (아직 해결되지 않은 경우)
  - `Resolves: #34` (이슈를 해결한 경우)
  - `Related to: #23` (참고할 이슈가 있을 경우)

```shell
<type>[optional scope]: <description>
[optional body]
[optional footer(s)]
```

## 브랜치 작명법
- feat/상세기능
