package com.example.springjpaquerydslproject.controller;

import com.example.springjpaquerydslproject.entity.Post;
import com.example.springjpaquerydslproject.model.PostRequest;
import com.example.springjpaquerydslproject.model.TestDTO;
import com.example.springjpaquerydslproject.model.TestDTO2;
import com.example.springjpaquerydslproject.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/post/list")
    public ResponseEntity<List<Post>> getPostList(
            @RequestParam(name = "isDeleted", defaultValue = "false") Boolean isDeleted
    ) {
        return ResponseEntity.ok(postService.getPostList(isDeleted));
    }

    @PostMapping("/post")
    public ResponseEntity<String> getPostList(@RequestBody PostRequest postRequest) {
        postService.createPost(postRequest);

        return ResponseEntity.ok("SUCCESS");
    }

    @GetMapping("/post/Test01")
    public ResponseEntity<List<TestDTO>> getTest() {
        return ResponseEntity.ok(postService.getTest());
    }

    @GetMapping("/post/Test02")
    public ResponseEntity<List<TestDTO2>> getPostWithCount() {
        return ResponseEntity.ok(postService.getPostWithCount());
    }

}
