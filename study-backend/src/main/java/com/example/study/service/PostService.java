package com.example.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.entity.PostEntity;
import com.example.study.respository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository pRepository;
	
	public List<PostEntity> getAllPostEntities() {
		return pRepository.findAll();
	}
	public void savePost(PostEntity entity) {
		pRepository.save(entity);
	}
}
