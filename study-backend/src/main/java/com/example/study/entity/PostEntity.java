package com.example.study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="postentity")
public class PostEntity {
	// Posts col
	@Id
	private Long postidx;
	private String content;
	private String title;
	private String nickname;
	private Long userid;
	
	public Long getPostidx() {
		return postidx;
	}

	public void setPostidx(Long postidx) {
		this.postidx = postidx;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "PostEntity [postidx=" + postidx + ", content=" + content + ", title=" + title + ", nickname=" + nickname
				+ ", userid=" + userid + "]";
	}

}
