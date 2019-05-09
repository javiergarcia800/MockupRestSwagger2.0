package com.mockup.dto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class User {

	private static final Logger LOG = LogManager.getLogger(User.class);
	
	private String username;
	private String password;
	
	public User() {
		super();
		LOG.debug("constructor...");
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	} 
	
	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return new StringBuffer().append("[")
				.append("username").append("=").append(username).append(", ")
				.append("password").append("=").append(password)
				.append("]").toString();
	}
	
}
