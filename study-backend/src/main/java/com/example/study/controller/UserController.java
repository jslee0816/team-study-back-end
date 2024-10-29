package com.example.study.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.entity.UserEntity;
import com.example.study.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@CrossOrigin(origins = "http://study-frontend-tl.s3-website-us-east-1.amazonaws.com")
public class UserController {
    @Autowired
    private UserService service;
    
    UserEntity user = new UserEntity();
    
    @GetMapping("/users")
    public List<UserEntity> allUser() {
        return service.allUser();
    }

    // 회원가입
    @PostMapping("/register")
    public ResponseEntity<UserEntity> registerUser(@RequestBody UserEntity registerRequest) {
        user = service.registerUser(registerRequest.getEmail(), registerRequest.getNickname(), registerRequest.getPwd());
        return ResponseEntity.ok(user);
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<UserEntity> loginUser(@RequestBody UserEntity loginRequest, HttpServletRequest request) {
        UserEntity user = service.loginUser(loginRequest.getEmail(), loginRequest.getPwd());
        
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        
        return ResponseEntity.ok(user);
    }
}
