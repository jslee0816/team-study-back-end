package com.example.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
