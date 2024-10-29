package com.example.study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "userentity")
public class UserEntity {
	
	//Users col
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long useridx;
	private String email;
	private String nickname;
	private String pwd;
	public Long getUseridx() {
		return useridx;
	}
	public void setUseridx(Long useridx) {
		this.useridx = useridx;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "UserEntity [useridx=" + useridx + ", email=" + email + ", nickname=" + nickname + ", pwd=" + pwd + "]";
	}

}
