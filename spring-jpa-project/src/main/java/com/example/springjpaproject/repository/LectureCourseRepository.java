package com.example.springjpaproject.repository;

import com.example.springjpaproject.entity.LectureCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureCourseRepository extends JpaRepository<LectureCourse,Long> {
}
