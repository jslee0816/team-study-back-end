package com.example.study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PostEntity {
	// Posts col
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;
	
	private String contents;
	private String title;
	private String userName;
	
	public PostEntity() {}
	public PostEntity(Long idx, String contents, String title, String userName) {
		this.idx = idx;
		this.contents = contents;
		this.title = title;
		this.userName = userName;
	}

	
	//Getter
	public String getContents() {
		return contents;
	}
	public Long getIdx() {
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
	public void setIdx(Long idx) {
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
		return " PostEntities {" + 
				" contents=" + contents +
				" idx=" + idx +
				" title=" + title +
				" userName=" + userName + "}";
	}
	
}
