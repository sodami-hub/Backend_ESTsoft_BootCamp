package com.example.springjpaproject.service;

import com.example.springjpaproject.entity.Student;

public interface StudentService {
    Student findById(long id);
}
