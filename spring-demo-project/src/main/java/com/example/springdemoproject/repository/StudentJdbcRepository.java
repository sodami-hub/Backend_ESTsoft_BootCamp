package com.example.springdemoproject.repository;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import javax.sql.RowSet;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public Student selectAllStudent() {

        return jdbcTemplate.queryForObject("select * from student", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getLong("id"));
                student.setAge(rs.getInt("age"));
                student.setName(rs.getString("name"));
                student.setDesc(rs.getString("desc"));
                student.setCreate_at(rs.getDate("create_at"));
                return student;
            }
        });
    }

    public List<String> selectInstructorNameList() {
        return jdbcTemplate.queryForList("select name from instructor", String.class);
    }
}
