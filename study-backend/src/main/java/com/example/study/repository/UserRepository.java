package com.example.study.repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.study.entity.UserEntity;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
    UserEntity findByNickname(String nickname);
    UserEntity findByEmailAndPwd(String email, String pwd);

}

