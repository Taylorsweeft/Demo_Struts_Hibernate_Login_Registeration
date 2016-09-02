package com.taylosweeft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	private Integer id;
	private String username;
	private String password;
	private String eMail;

	@Id
	@GeneratedValue
	// 实现自增
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public User(Integer id, String username, String password, String eMail) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.eMail = eMail;
	}

	public User() {
		super();
	}

}
