1. start.spring.io 에서 스프링 프로젝트 생성
 -> spring initializr를 이용하여 간단하게 생성
 -> 필요한 부가기능들을 추가하여 생성가능
 -> 이번 프로젝트에서는 web, JPA, h2(db),  Thymeleaf 추가


#h2 설정
h2 : 자바로 작성된 관계형 데이터베이스 관리 시스템
https://thatisgood.tistory.com/entry/H2-%EC%84%A4%EC%A0%95-%EB%B0%8F-%EC%A0%91%EC%86%8D-%EB%B0%A9%EB%B2%95

서버 접속시 
localhost:8080/console
위의 경로로 접속하면 h2db 관리 시스템에서 직접 관리 가능

깃 허브 사용법 -> 유튜브에서 git and github foundations 검색하여 확인

2. 이 프로젝트의 class 작성 순서
    1. Author.java
    2. Book.java
    3. application.properties
    4. AuthorRepository Interface
    5. BookRepository Interface
    6. DevBootstrap Interface
    7. Publisher.java
    8. PublisherRepository Interface
    9. DevBootstrap Interface -> publisher 추가
    
