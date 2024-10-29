package com.example.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.example.study.entity.UserEntity;
import com.example.study.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // 모든 사용자 조회
    public List<UserEntity> allUser() {
        return userRepository.findAll();
    }
    
    // 회원 가입
    public UserEntity registerUser(String email, String nickName, String pwd) {
        UserEntity user = new UserEntity();
        user.setEmail(email);
        user.setNickname(nickName);
        user.setPwd(pwd);
        return userRepository.save(user);
    }
    
    // 로그인
    public UserEntity loginUser(String email, String pwd) {
        UserEntity user = userRepository.findByEmail(email);
        if (user == null || !user.getPwd().equals(pwd)) {
//            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "이메일 혹은 패스워드를 다시 확인하세요.");
        }
        return user;
    }

}
