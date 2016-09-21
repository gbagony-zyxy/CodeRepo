package org.ruyin.code.spring.bean;

public class User {

	private String username;

	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name,String email){
		this.username = name;
		this.email = email;
	}

}
