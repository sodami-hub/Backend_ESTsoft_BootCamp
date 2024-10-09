package com.example.springdemoproject.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Objects;


// Spring JDBC 로 JDBC의 발전 형태
@Repository("StudentJdbcRepository")
public class StudentJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> selectStudentNameList() {
        return jdbcTemplate.queryForList("select name from student", String.class);
    }

    public Map<String, Object> selectStudentName(String name) {
        return jdbcTemplate.queryForMap("select name from student where name = ?", name);
    }

    public List<Student> selectAllStudent() {
        return jdbcTemplate.queryForList("select * from student",Student.class);
    }

    public List<String> selectInstructorNameList() {
        return jdbcTemplate.queryForList("select name from instructor", String.class);
    }
}
