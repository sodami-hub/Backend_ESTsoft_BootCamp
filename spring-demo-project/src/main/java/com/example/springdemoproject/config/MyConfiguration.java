package com.example.springdemoproject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.componentscanexam")  // 외부 패키지의 콤포넌트를 패키지 스캔!
public class MyConfiguration {

}
