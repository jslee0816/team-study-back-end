package com.example.study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PostEntity {
	// Posts col
	@Id
	private Integer idx;
	private String contents;
	private String title;
	private String userName;
	
	//Getter
	public String getContents() {
		return contents;
	}
	public Integer getIdx() {
		return idx;
	}
	public String getTitle() {
		return title;
	}
	public String getUserName() {
		return userName;
	}
	
	//Setter
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setIdx(Integer idx) {
		this.idx = idx;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "PostEntities {" + 
				"contents=" + contents +
				"idx=" + idx +
				"title=" + title +
				"userName=" + userName + "}";
	}
	
}
