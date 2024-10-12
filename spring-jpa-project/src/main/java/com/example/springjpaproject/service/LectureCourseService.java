package com.example.springjpaproject.service;

import com.example.springjpaproject.entity.LectureCourse;

import java.util.List;
import java.util.Map;

public interface LectureCourseService {
    LectureCourse findById(long id);

    void registLecture(Map<String, Object> params);

    List<LectureCourse> findAll();
}
