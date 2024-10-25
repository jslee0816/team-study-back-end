package com.example.study.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

}
