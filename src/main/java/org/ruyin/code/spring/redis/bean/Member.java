package org.ruyin.code.spring.redis.bean;

import java.io.Serializable;

public class Member implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String nickname;

	public Member() {
	}

	public Member(String id, String nickname) {
		this.id = id;
		this.nickname = nickname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
