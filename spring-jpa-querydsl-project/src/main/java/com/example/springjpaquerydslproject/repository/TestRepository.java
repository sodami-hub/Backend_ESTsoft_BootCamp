package com.example.springjpaquerydslproject.repository;

import com.example.springjpaquerydslproject.model.TestDTO;
import com.example.springjpaquerydslproject.model.TestDTO2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository{
    List<TestDTO2> selectPostWithCount();
    List<TestDTO> selectPostTest();
}
