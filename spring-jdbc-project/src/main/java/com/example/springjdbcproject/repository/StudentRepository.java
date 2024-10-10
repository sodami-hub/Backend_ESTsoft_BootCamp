package com.example.springjdbcproject.repository;

import com.example.springjdbcproject.model.Student;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface StudentRepository {
    int countOfStudents();
    List<String> selectListOfStudentName();

    int insertStudent(Map<String,Object> params);

    Student getStudentById(int id);

    int insertStudent(Student student);
    List<Student> selectListOfStudent();
    List<Student> findStudents(String name);
    Optional<Student> selectStudentById(Integer studentId);
}
