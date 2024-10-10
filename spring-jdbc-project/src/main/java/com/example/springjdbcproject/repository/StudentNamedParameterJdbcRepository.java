package com.example.springjdbcproject.repository;

import com.example.springjdbcproject.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.security.spec.NamedParameterSpec;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
@Repository("studentNamedParameterJdbcRepository")
public class StudentNamedParameterJdbcRepository implements StudentRepository{

    @Autowired
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public int countOfStudents() {
        return 0;
    }

    @Override
    public List<String> selectListOfStudentName() {
        return List.of();
    }

    @Override
    public int insertStudent(Map<String, Object> params) {
        return 0;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public int insertStudent(Student student) {
        return 0;
    }

    @Override
    public List<Student> selectListOfStudent() {
        return List.of();
    }

    @Override
    public List<Student> findStudents(String name) {
        return List.of();
    }

    @Override
    public Optional<Student> selectStudentById(Integer studentId) {
        return null;
    }
}
