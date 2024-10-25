package com.example.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.study.entity.PostEntity;
import com.example.study.service.PostService;

public class PostController {
	@Autowired
	private PostService service;
	
	@GetMapping("/posts")
	public List<PostEntity> getPostEntity() {
		return service.getAllPostEntities();
	}
}
