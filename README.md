# Server
SOPT 34기 솝커톤 iOS 1팀 Server Repository입니다
---
1️⃣  서비스 이름과 소개
2️⃣  API 명세서와 역할 분배(각자 개발 담당 부분)
3️⃣  코드 컨벤션
4️⃣  프로젝트 폴더링
5️⃣  ERD 캡쳐 사진

### TEAM
---
<img width="550" alt="image" src="https://github.com/34th-SOPKATHON-iOS-TEAM1/Server/assets/128011308/b2527b72-8fa0-4997-8f8a-62eb292e390e">

|                             김보람                             |                                                                김가연                                                                 |
| :----------------------------------------------------------: |:----------------------------------------------------------------------------------------------------------------------------------:|
| <img src="https://github.com/NOW-SOPT-SERVER/.github/assets/79795051/39f21bd4-afe5-45fb-96cb-2ca632297621" width="200"/> | <img src="https://github.com/NOW-SOPT-SERVER/.github/assets/79795051/78e790f7-2584-4e49-89bd-a30045054670" width="200"/> |
|              [bo-ram-bo-ram](https://github.com/bo-ram-bo-ram)               |                                             [kgy1008](https://github.com/kgy1008)



| 담당 역할              |   Role   |
|:-------------------|:--------:|
| 프로젝트 초기 세팅       |   김보람    |
| 배포                  |   김보람    |
| DB 설계              | 김보람, 김가연 |
|  API  |       |
|  API  |       |
|  API      |      |



## 🛠️ 개발 환경
| 통합 개발 환경 | IntelliJ |
| --- | --- |
| Spring 버전 | 3.2.5 |
| 데이터베이스 | AWS RDS(postgresql) |
| 배포 | AWS EC2(Ubuntu) |
| Project 빌드 관리 도구 | Gradle |
| Java version | Java 17 |
| 패키지 구조 | 계층형 패키지 구조 |

### 아키텍쳐 구조도
<img width="649" alt="image" src="">


### 프로젝트 폴더 구조도
```
📂 sopkathon34Server

🗂 java/sopt/org/sopkathonServer
  🗂 common
      🗂 brand
          🗂 advice
          🗂 exception
  🗂 config
  🗂 controller
      🗂 dto
  🗂 domain
  🗂 infrastructure
  🗂 service
🗂 resources
  application.yml
```


### API 명세서

[API 명세서](https://lemon-leather-188.notion.site/API-5099a39c67544ee287f8af9a823dff4d?pvs=4) 

### 데이터베이스 ERD
<img src="https://fancy-death-29b.notion.site/API-afc634853ae54b2abb9406e817270546?pvs=4" width=450/>

    
# 👥 우리들의 컨벤션

[Backend Convention](https://fancy-death-29b.notion.site/3f4e680f77014f53812c66ceebfb4ad4?pvs=4)

