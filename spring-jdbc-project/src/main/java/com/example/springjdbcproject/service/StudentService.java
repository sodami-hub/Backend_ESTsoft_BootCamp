package com.example.springjdbcproject.service;

import com.example.springjdbcproject.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    @Autowired
    @Qualifier("studentJdbcRepository")
    private StudentRepository studentRepository;


    public Integer countOfStudent() {
        return studentRepository.countOfStudents();
    }

    public List<String> selectListOfStudentName() {
        return studentRepository.selectListOfStudentName();
    }

    public void registStudent(Map<String, Object> params) {
        studentRepository.insertStudent(params);
    }
}
