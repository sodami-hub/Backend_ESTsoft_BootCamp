package com.example.springjpaproject.service;

import com.example.springjpaproject.entity.Instructor;

import java.util.List;
import java.util.Map;

public interface InstructorService {
    void instructorRegist(Map<String, Object> params);
    public List<Instructor> instructorList();
    public Instructor findByIdToInstructor(Long id);
}
