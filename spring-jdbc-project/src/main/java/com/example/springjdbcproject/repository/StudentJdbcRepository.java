package com.example.springjdbcproject.repository;

import com.example.springjdbcproject.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@Repository("studentJdbcRepository")
public class StudentJdbcRepository implements StudentRepository{
    private final JdbcTemplate jdbcTemplate;

    public StudentJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int countOfStudents() {
        return Objects.requireNonNull(jdbcTemplate.queryForObject("select count(*) from student", Integer.class));
    }

    @Override
    public List<String> selectListOfStudentName() {
        return jdbcTemplate.queryForList("Select name from student", String.class);
    }

    @Override
    public int insertStudent(Map<String, Object> params) {
        String name = (String) params.get("name");
        int age = Integer.parseInt((String)(params.get("age")));
        return jdbcTemplate.update("insert into student(name,age,create_at) values(?,?,now())",name,age);
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
