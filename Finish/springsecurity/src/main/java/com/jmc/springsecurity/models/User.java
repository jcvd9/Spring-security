package com.jmc.springsecurity.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.Persistent;

@Entity
public class User {
	
	@Id
	private Integer Id;
	private String username;
	private String password;
	
	public User() {

	}
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

	public User(Integer id, String username, String password) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
	}
	
	
	

}
