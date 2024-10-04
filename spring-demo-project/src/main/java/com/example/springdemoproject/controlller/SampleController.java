package com.example.springdemoproject.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("hello2")
    public String hello2() {
        return "hi";  // DispatcherServlet 클래스가 "/resources/templates/" 에서 요청에 맞는 응답을 해줌
    }
}
