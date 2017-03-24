package org.ruyin.code.spring.bean;

public class User {

	private String username;

	private String email;

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public User() {}
	
	public User(String name,String email){
		this.username = name;
		this.email = email;
	}

}
