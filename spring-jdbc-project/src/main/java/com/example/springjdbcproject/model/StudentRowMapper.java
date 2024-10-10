package com.example.springjdbcproject.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper  implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();

        student.setId(rs.getLong("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        student.setCreate_at(rs.getDate("create_at"));

        return student;
    }
}
