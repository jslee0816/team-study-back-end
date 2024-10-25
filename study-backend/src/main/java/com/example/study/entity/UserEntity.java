package com.example.study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	
	//Users col
	@Id
	private String email;
	private String nickName;
	
	//Getter
	public String getEmail() {
		return email;
	}
	public String getNickName() {
		return nickName;
	}
	
	//Setter
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String toString() {
		return "UserEntities {" + 
				"email=" + email +
				"nickName=" + nickName + "}";
	}
	
}
