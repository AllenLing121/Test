package com.ling.entity;

import java.io.Serializable;

public class User implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 2892358738565196531L;

	private Long id;

   
    private String userName;
    private String password;
    

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}