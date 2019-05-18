package com.dxc.model;

import org.springframework.data.annotation.Id;

public class User {
	private String username;
	private String password;
	private String email;
	private String phoneNo;	

	public String getusername() {
		return this.username;
	}
	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public User() {		
	}
	
	public User(String username, String password, String email_id, String contact_no) {
		super();
		this.setUserName(username);
		this.setPassword(password);
		this.setEmail(email_id);
		this.setPhoneNo(contact_no);
	}

	


}
