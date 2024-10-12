package com.example.springjpaproject.controller;

import com.example.springjpaproject.entity.Instructor;
import com.example.springjpaproject.service.InstructorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class InstructorController {

    @Autowired
    InstructorServiceImpl instructorService;

    @PutMapping("/instructor/regist")
    public void instructorRegist(@RequestBody Map<String,Object> params) {
        instructorService.instructorRegist(params);
    }

    @GetMapping("/instructor/list")
    public List<Instructor> instructorList() {
        return instructorService.instructorList();
    }

    @GetMapping("/instructor/findId/{id}")
    public Instructor findByIdToInstructor(@PathVariable Long id) {
        return instructorService.findByIdToInstructor(id);
    }
}
