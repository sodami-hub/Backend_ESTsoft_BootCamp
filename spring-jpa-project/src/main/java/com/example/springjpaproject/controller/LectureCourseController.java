package com.example.springjpaproject.controller;

import com.example.springjpaproject.service.LectureCourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LectureCourseController {

    @Autowired
    LectureCourseServiceImpl lectureCourseService;

    @GetMapping("/lecture/course/{id}")
    public String getLectureCourseById(@PathVariable Long id) {
        return lectureCourseService.findById(id).getTitle();
    }

    @PutMapping("/lecture/regist")
    public void registLecture(@RequestBody Map<String,Object> params) {
        lectureCourseService.registLecture(params);
    }
}
