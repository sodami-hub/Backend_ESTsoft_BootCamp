package com.example.springjpaproject.service;

import com.example.springjpaproject.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    Student findById(long id);
    List<Student> findAll();
    void registStudent(Map<String,Object> params);
    void updateStudent(Map<String,Object> params);
}
