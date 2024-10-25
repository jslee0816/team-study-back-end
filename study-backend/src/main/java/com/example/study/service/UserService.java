package com.example.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.entity.UserEntity;
import com.example.study.respository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepository;
	
	public List<UserEntity> getAllUserEntities() {
		return uRepository.findAll();
	}
}
