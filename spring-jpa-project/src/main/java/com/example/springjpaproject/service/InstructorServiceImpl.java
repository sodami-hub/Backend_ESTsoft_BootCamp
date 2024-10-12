package com.example.springjpaproject.service;

import com.example.springjpaproject.entity.Instructor;
import com.example.springjpaproject.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class InstructorServiceImpl implements InstructorService{

    @Autowired
    InstructorRepository instructorRepository;

    @Override
    public void instructorRegist(Map<String, Object> params) {
        Instructor instructor = new Instructor();
        instructor.setName((String)params.get("name"));
        instructor.setDesc((String)params.get("desc"));
        instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> instructorList() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor findByIdToInstructor(Long id) {
        return instructorRepository.findById(id).get();
    }
}
