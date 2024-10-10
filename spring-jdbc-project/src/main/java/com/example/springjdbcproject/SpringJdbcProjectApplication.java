package com.example.springjdbcproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//        (exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringJdbcProjectApplication {
    //https://github.com/spring-projects/spring-framework/blob/main/spring-jdbc/src/test/java/org/springframework/jdbc/core/JdbcTemplateTests.java

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcProjectApplication.class, args);
    }

}
