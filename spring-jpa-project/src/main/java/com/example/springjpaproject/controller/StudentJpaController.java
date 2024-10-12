package com.example.springjpaproject.controller;

import com.example.springjpaproject.entity.Student;
import com.example.springjpaproject.service.LectureCourseServiceImpl;
import com.example.springjpaproject.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class StudentJpaController {
    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/student/{id}")
    public String getStudentName(@PathVariable Long id) {
        return studentService.findById(id).getName();
    }

    @GetMapping("/student/list")
    public List<Student> studentsList() {
        return studentService.findAll();
    }

    @PutMapping("/student/regist")
    public void registStudent(@RequestBody Map<String,Object> params) {
        studentService.registStudent(params);
    }

    @PutMapping("/student/update")
    public void updateStudent(@RequestBody Map<String,Object> params) {
        studentService.updateStudent(params);
    }
}