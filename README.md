## Inflearn

<img src="https://github.com/JHyun0302/server/assets/60764632/24cec8a1-ddb4-42c4-8e5b-2ff8d8fe6f49"  width="600" height="300"/>

### 강의명 : [스프링 부트 - 핵심 원리와 활용](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%ED%95%B5%EC%8B%AC%EC%9B%90%EB%A6%AC-%ED%99%9C%EC%9A%A9)

- 지식공유자 : 김영한

### 강의 내용

- 스프링 부트가 제공하는 5가지 핵심 기능
    1. 내장 서버
    2. 자동 라이브러리 관리
    3. 자동 구성
    4. 외부 설정
    5. 모니터링 & 관리 기능

- 정리 : 동적 자동 구성 vs 정적 자동 구성
    - 정적 자동 구성 : `@Configuration, @Bean` 이용
        - 특징 : 애노테이션 기반
    - 동적 자동 구성 : `ImportSelector` 인터페이스 이용해서 구현체 만들기
        - 특징 : 프로그래밍 기반
        - 장점 :  if문 넣어서 조건에 따라 어떤 설정 정보를 return 할 지 지정 가능 