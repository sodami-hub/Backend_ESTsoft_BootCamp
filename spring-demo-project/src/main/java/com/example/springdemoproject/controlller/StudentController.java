package com.example.springdemoproject.controlller;

import com.example.springdemoproject.repository.Student;
import com.example.springdemoproject.repository.StudentJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@RestController
public class StudentController {
    @Autowired
    private StudentJdbcRepository studentJdbcRepository;

    @GetMapping("/student/name/list")
    public List<String> getListOfStudentName() {
        return studentJdbcRepository.selectStudentNameList();
    }

    @GetMapping("/student/name")
    public Map<String, Object> getStudentName(@RequestParam String name) {
        return studentJdbcRepository.selectStudentName(name);
    }

    @GetMapping("/instructor/name/list")
    public List<String> getListOfInstructor() {
        return studentJdbcRepository.selectInstructorNameList();
    }


    @GetMapping("/student/all")
    public Student getStudentAll() throws SQLException {
        return studentJdbcRepository.selectAllStudent();
    }


}
