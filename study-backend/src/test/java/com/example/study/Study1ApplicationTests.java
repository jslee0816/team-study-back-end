package com.example.study;

import com.example.study.entity.UserEntity;
import com.example.study.repository.UserRepository;
import com.example.study.service.UserService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class Study1ApplicationTests {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    private UserEntity user;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        user = new UserEntity();
        user.setEmail("test@example.com");
        user.setNickname("testUser");
        user.setPwd("password");
    }

    @Test
    void testRegisterUser() {
        when(userRepository.save(any(UserEntity.class))).thenReturn(user);
        
        UserEntity registeredUser = userService.registerUser("test2", "test2@test.com", "test2pwd");
        
        assertNotNull(registeredUser);
        assertEquals("test@example.com", registeredUser.getEmail());
    }

    @Test
    void testLoginUser_Success() {
        when(userRepository.findByEmail("test2@test.com")).thenReturn(user);
        
        UserEntity loggedInUser = userService.loginUser("test2@test.com", "test2pwd");
        
        assertNotNull(loggedInUser);
        assertEquals("test@example.com", loggedInUser.getEmail());
    }

    @Test
    void testLoginUser_Failure() {
        when(userRepository.findByEmail("11@test.com")).thenReturn(null);
        
        UserEntity loggedInUser = userService.loginUser("11@test.com", "wrongPassword");
        
        assertNull(loggedInUser);
    }
}
