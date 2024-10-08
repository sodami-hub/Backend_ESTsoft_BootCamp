package com.example.springdemoproject.interf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InterDependencyService {

    private final Inter inter;

    // interface 타입으로 의존성주임(DI) 할 때 구현체 지정하는 방법 2가지
    // 구현체가 하나인경우는 스프링이 알아서 잘 찾아준다.
    // 1. @Qualifier("빈 이름(구현체) 지정") ex. @Qualifier("interImpleA") Inter inter  // 괄호안에는 Beans 네임이 들어가야됨(소문자 시작)
    // 2. @Primary - 구현체로 지정할 최우선 객체에 어노테이션 추가.
    public InterDependencyService(@Qualifier("interImplB") Inter inter) {
        this.inter =inter;
    }

    public void printMethod() {
        inter.interMethod();
    }


}
