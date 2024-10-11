package com.example.springjpaquerydslproject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {
    private Long categoryId; // 1L
    private Long userId; // 1L
    private String title;
    private String content;
}
