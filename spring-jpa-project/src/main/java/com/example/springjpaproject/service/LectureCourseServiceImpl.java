package com.example.springjpaproject.service;

import com.example.springjpaproject.entity.LectureCourse;
import com.example.springjpaproject.repository.LectureCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class LectureCourseServiceImpl implements LectureCourseService{

    @Autowired
    private LectureCourseRepository lectureCourseRepository;

    @Override
    public LectureCourse findById(long id) {
        return lectureCourseRepository.findById(id).get();
    }

    @Override
    public void registLecture(Map<String, Object> params) {
        LectureCourse lectureCourse = new LectureCourse();

        //lectureCourse.setId((Long)params.get("id"));
        lectureCourse.setTitle((String)params.get("title"));
        lectureCourse.setInstructorId(Long.parseLong(String.valueOf(params.get("instructor_id"))));
        lectureCourse.setCapacity((Integer)params.get("capacity"));
        lectureCourse.setFrom(LocalDate.parse((String)params.get("from")));
        lectureCourse.setTo(LocalDate.parse((String)params.get("to")));
//        lectureCourse.setCreatedAt(LocalDateTime.now());
//        lectureCourse.setUpdatedAt(LocalDateTime.now());
//        lectureCourse.setDesc(null);

        lectureCourseRepository.save(lectureCourse);
    }

    @Override
    public List<LectureCourse> findAll() {
        return lectureCourseRepository.findAll();
    }
}
