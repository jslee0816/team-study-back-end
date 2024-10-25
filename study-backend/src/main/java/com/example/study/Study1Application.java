package com.example.study;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.study.entity.PostEntity;
import com.example.study.entity.UserEntity;
import com.example.study.respository.PostRepository;
import com.example.study.respository.UserRepository;

@SpringBootApplication
public class Study1Application implements CommandLineRunner {
	
	@Autowired
	private PostRepository pRepository;
	@Autowired
	private UserRepository uRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Study1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<PostEntity> pEntities = pRepository.findAll();
		System.out.println("Post Entities in DB:");
		for(PostEntity entity : pEntities) {
			System.out.println(entity);
		}
		List<UserEntity> uEntities = uRepository.findAll();
		System.out.println("User Entities in DB:");
		for(UserEntity entity : uEntities) {
			System.out.println(entity);
		}
	}

}
