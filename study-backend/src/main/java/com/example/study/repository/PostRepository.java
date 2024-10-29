package com.example.study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
    PostEntity findByPostidx(Long postidx);
    List<PostEntity> findByUserid(Long userid);
}
