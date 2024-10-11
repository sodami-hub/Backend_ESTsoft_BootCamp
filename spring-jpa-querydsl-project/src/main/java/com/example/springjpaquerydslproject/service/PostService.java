package com.example.springjpaquerydslproject.service;

import com.example.springjpaquerydslproject.entity.Post;
import com.example.springjpaquerydslproject.model.PostRequest;
import com.example.springjpaquerydslproject.model.TestDTO;
import com.example.springjpaquerydslproject.model.TestDTO2;
import com.example.springjpaquerydslproject.repository.PostRepository;
import com.example.springjpaquerydslproject.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    @Qualifier("testRepository")
    @Autowired
    private TestRepository testRepository;

    public List<Post> getPostList(Boolean isDeleted) {
        return postRepository.findAllByIsDeletedOrderByCreatedAtDesc(isDeleted);
    }

    public Post getPost(Long postId, Boolean isDeleted) {
        return postRepository.findByIdAndIsDeleted(postId, isDeleted);
    }

    @Transactional
    public void createPost(PostRequest request) {
        Post post = new Post();
        post.setTitle(request.getTitle());
        post.setCategoryId(request.getCategoryId());
        post.setUserId(request.getUserId());
        post.setContent(request.getContent());
        post.setIsDeleted(false);
        post.setCreatedAt(LocalDateTime.now());
        post.setUpdatedAt(LocalDateTime.now());

        postRepository.save(post);
    }

    public List<TestDTO> getTest() {
        return testRepository.selectPostTest();
    }
    public List<TestDTO2> getPostWithCount() {
        return testRepository.selectPostWithCount();
    }
}
