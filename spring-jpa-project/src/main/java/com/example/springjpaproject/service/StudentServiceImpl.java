package com.example.springjpaproject.service;

import com.example.springjpaproject.entity.Student;
import com.example.springjpaproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student findById(long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void registStudent(Map<String, Object> params) {
        Student student = new Student();
        student.setName((String) params.get("name"));
        student.setAge((Integer) params.get("age"));
        student.setDesc((String) params.get("desc"));

        studentRepository.save(student);
    }

    @Override
    public void updateStudent(Map<String, Object> params) {
        Student student = new Student();
        Student originData;
        originData = studentRepository.findById(Long.parseLong(String.valueOf(params.get("id")))).get();
        student.setId(Long.parseLong(String.valueOf(params.get("id"))));

        if(params.get("name")==null) {
            student.setName(originData.getName());
        } else {
            student.setName((String) params.get("name"));
        }
        if(params.get("age")==null) {
            student.setAge(originData.getAge());
        } else {
            student.setAge((Integer) params.get("age"));
        }
        if(params.get("desc")==null) {
            student.setDesc(originData.getDesc());
        } else {
            student.setDesc((String) params.get("desc"));
        }
        studentRepository.save(student);
    }
}
