package com.example.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.study.entity.UserEntity;
import com.example.study.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	UserEntity user = new UserEntity();
	
	@GetMapping("/users")
	public List<UserEntity> allUser() {
		return service.allUser();
	}
	
	// 회원가입
//	@PostMapping("/register")
//	public ResponseEntity<UserEntity> registerUser(@RequestParam String email,
//											        @RequestParam String nickName,
//											        @RequestParam String pwd) {
//	    UserEntity user = service.registerUser(email, nickName, pwd);
//	    return ResponseEntity.ok(user);
//	}
	
	@PostMapping("/register")
	public ResponseEntity<UserEntity> registerUser(@RequestBody UserEntity registerRequest) {
	    user = service.registerUser(registerRequest.getEmail(), registerRequest.getNickname(), registerRequest.getPwd());
	    return ResponseEntity.ok(user);
	}

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<UserEntity> loginUser(@RequestBody UserEntity registerRequest) {
    	user = service.loginUser(registerRequest.getEmail(), registerRequest.getPwd());
    	return ResponseEntity.ok(user);
    }
}
