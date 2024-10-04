package com.example.springdemoproject.service;

import org.springframework.stereotype.Service;

// 스프링이 관리하는 객체로 등록 - '빈' 클래스 선언문 옆에 콩 모양으로 시각적으로 표현
// 빈 -> 스프링 컨테이너가 관리하고 생성하는 객체(컨테이너.. 스프링 자체)
@Service
public class HelloService {
    public String printHello(String param) {
        return "Hello, "+param;
    }
}
