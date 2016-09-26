package com.niit.Backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class UserDetails {
	
	@Id
	@GeneratedValue
	@Column(name = "userId")
	private int userId;
	private String name;
	
	private String userName;
	private String password;
	private String mobile;
	
	private String role;
	private String enable;
	
	private String emailId;
	
	public int getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getMobile() {
		return mobile;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getRole() {
		return role;
	}
	public String getEnable() {
		return enable;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	
	
}