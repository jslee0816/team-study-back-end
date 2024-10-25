package com.example.study.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}
