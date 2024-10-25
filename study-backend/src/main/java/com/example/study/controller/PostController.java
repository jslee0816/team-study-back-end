package com.example.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.entity.PostEntity;
import com.example.study.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	@Autowired
	private PostService service;
	
	@GetMapping("/getall")
	public List<PostEntity> getPostEntity() {
		return service.getAllPostEntities();
	}
	
	@PostMapping("/create")
	public void createPost(@RequestBody PostEntity entity) {
		service.savePost(entity);
	}
}
