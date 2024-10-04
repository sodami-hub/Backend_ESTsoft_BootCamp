package com.example.springdemoproject.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    public static void main(String[] args) {
//
//    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value="param", defaultValue = "Spring") String param) {
        // RequestParam -> URI의 Query String을 가져와서 key(param)값을 찾음

        return "hello," + param;
    }
}
