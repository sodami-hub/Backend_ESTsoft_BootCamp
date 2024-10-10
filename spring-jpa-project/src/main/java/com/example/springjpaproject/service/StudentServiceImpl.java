package com.example.springjpaproject.service;

import com.example.springjpaproject.entity.Student;
import com.example.springjpaproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student findById(long id) {
        return studentRepository.findById(id).get();
    }
}
