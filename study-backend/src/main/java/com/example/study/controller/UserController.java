package com.example.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.entity.UserEntity;
import com.example.study.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<UserEntity> getPostEntity() {
		return service.getAllUserEntities();
	}
	@PostMapping("/signup")
	public void createUser(@RequestBody UserEntity entity) {
		service.saveUser(entity);
	}
}
