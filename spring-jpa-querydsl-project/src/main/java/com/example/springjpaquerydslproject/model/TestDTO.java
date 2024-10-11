package com.example.springjpaquerydslproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
    public class TestDTO {
    private Long postId;
    private String title;
    private String contents;
    private Long commentId;
    private String commentContent;
    private Long userId;
}
