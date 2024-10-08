package com.example.springdemoproject.controlller;

import com.example.springdemoproject.interf.InterDependencyService;
import com.example.springdemoproject.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // @Autowired// 스프링의 의존성 주입으로 객체의 관리를 맡김 최근에는 잘 사용되지 않음

    private final HelloService service; // Dependency Injection
    private final InterDependencyService interService;

    // 생성자 주입 방식으로 DI - 최근 많이 사용되는 방식
    public HelloController(HelloService helloService ,InterDependencyService interService) {
        this.service = helloService;
        this.interService = interService;
    }


    @GetMapping("/hello")
    public String hello(@RequestParam(value="param", defaultValue = "Spring") String param) {
        // RequestParam -> URI의 Query String을 가져와서 key(param)값을 찾음

        interService.printMethod();

        /*
        // 객체를 생성해서 메소드를 사용하는 일반적인 방법 DI를 하면 이렇게 사용하지 않음.
        HelloService service = new HelloService();
        return service.printHello(param);
        */

        return service.printHello(param);  // @RestController에 포함된 @ResponseBody 의 기능으로 리턴 값 그대로 화면에 띄워준다.
        // @Controller 는 리턴하는 문자열 형태의 view를 찾아준다. return "hi" => hi.html을 디스패쳐서블릿이 찾아서 전달
    }
}
