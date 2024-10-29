package com.example.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.entity.PostEntity;
import com.example.study.service.PostService;

@RestController
@CrossOrigin(origins = "http://study-frontend-tl.s3-website-us-east-1.amazonaws.com")
public class PostController {
    @Autowired
    private PostService service;

    @GetMapping("/posts")
    public List<PostEntity> getPostEntity() {
        return service.getAllPost();
    }

    // 글 등록
    @PostMapping("/createContent")
    public ResponseEntity<PostEntity> registerUser(@RequestBody PostEntity postRequest) {

        PostEntity post = service.createContent(postRequest.getTitle(), postRequest.getContent(), postRequest.getNickname(), postRequest.getUserid());
        return ResponseEntity.ok(post);
    }

    // 글 상세보기
    @GetMapping("/postDetail/{postIdx}")
    public ResponseEntity<PostEntity> postDetail(@PathVariable Long postIdx) {
        PostEntity post = service.postDetail(postIdx);
        return ResponseEntity.ok(post);
    }
}
