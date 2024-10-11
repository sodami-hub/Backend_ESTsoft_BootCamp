package com.example.springjpaquerydslproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class TestDTO2 {
    private Long postId;
    private String title;
    private String contents;
    private Long commentContent;
    private Long userId;
}
