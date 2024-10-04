package com.example.springdemoproject.controlller;

import com.example.springdemoproject.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // 스프링의 의존성 주입으로 객체의 관리를 맡김
    @Autowired
    private HelloService service; // Dependency Injection

    /*
    //생성자 주입방식(@Autowired 사용하지 않고)
    public HelloController(HelloService service) {
        this.service = service;
    }
    */

    @GetMapping("/hello")
    public String hello(@RequestParam(value="param", defaultValue = "Spring") String param) {
        // RequestParam -> URI의 Query String을 가져와서 key(param)값을 찾음

        /*
        // 객체를 생성해서 메소드를 사용하는 일반적인 방법
        HelloService service = new HelloService();
        return service.printHello(param);
        */

        return service.printHello(param);
    }
}
