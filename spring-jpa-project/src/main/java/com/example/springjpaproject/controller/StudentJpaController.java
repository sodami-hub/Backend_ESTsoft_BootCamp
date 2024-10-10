package com.example.springjpaproject.controller;

import com.example.springjpaproject.service.LectureCourseServiceImpl;
import com.example.springjpaproject.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentJpaController {
    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/student/{id}")
    public String getStudentName(@PathVariable Long id) {
        return studentService.findById(id).getName();
    }
}