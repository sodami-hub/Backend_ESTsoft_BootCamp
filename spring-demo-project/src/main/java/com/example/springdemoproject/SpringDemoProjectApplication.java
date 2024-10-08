package com.example.springdemoproject;  // default package!!

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // ComponentScan 을 포함하는 어노테이션
public class SpringDemoProjectApplication { // default package에서의 컴포넌트 스캔이 이뤄진다.

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoProjectApplication.class, args);
    }

}
