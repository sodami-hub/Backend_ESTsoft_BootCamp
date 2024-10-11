package com.example.springjpaquerydslproject.controller;

import com.example.springjpaquerydslproject.model.CommentRequest;
import com.example.springjpaquerydslproject.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/comment")
    public ResponseEntity<Void> createComment(@RequestBody CommentRequest request) {
        commentService.createComment(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/most/commented")
    public List<Object[]> getMostCommentPost() {
        return commentService.getMostCommentPost();
    }
}
