package com.example.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.entity.PostEntity;
import com.example.study.entity.UserEntity;
import com.example.study.repository.PostRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
    private HttpServletRequest request;
	
	public List<PostEntity> getAllPost() {
		return postRepository.findAll();
	}
	
	// 게시글 등록
	public PostEntity createContent(String title, String content, String nickname, Long useridx) {
        PostEntity post = new PostEntity();
        HttpSession session = request.getSession(false);
        UserEntity user = (UserEntity) session.getAttribute("user");

        if (user == null) {
            throw new RuntimeException("사용자가 로그인되어 있지 않습니다.");
        }

        post.setTitle(title);
        post.setContent(content);
        post.setNickname(user.getNickname());
        post.setUserid(user.getUseridx());
        return postRepository.save(post);
    }
    
    public PostEntity postDetail(Long postidx) {
    	return postRepository.findByPostidx(postidx);
    }
}
