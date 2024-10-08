package com.example.springdemoproject.controlller;

import com.example.componentscanexam.HiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@ResponseBody  // 요게 추가되면 아래 return hi 의 값은 화면에 hi로 그냥 출력된다.
@Controller
public class SampleController {

//    HiService service;  // 사용안됨 다른 패키지에 있는 클래스... 컴포넌트 스캔의 대상이 아님


    @GetMapping("hello2")
    public String hello2() {

        /*
        여기에는 비지니스 로직이 들어간다 Model
        */

        // service.hiMethod(); // 에러 발생 Cannot invoke "com.example.componentscanexam.HiService.hiMethod()" because "this.service" is null
        return "hi";  // (View) DispatcherServlet 클래스가 "/resources/templates/" 에서 요청에 맞는 응답을 해줌
    }
}
