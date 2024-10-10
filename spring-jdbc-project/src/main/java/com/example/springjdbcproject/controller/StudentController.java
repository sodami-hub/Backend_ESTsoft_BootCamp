package com.example.springjdbcproject.controller;

import com.example.springjdbcproject.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/student/count")
    public Integer countOfStudent() {
        return studentService.countOfStudent();
    }

    @GetMapping("/student/name/list")
    public List<String> getListOfStudentName() {
        return studentService.selectListOfStudentName();
    }

    @GetMapping("/student/regist")
    public void registStudent(@RequestParam Map<String,Object> params) {
        studentService.registStudent(params);
    }
}
