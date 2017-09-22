package com.jsf.bootstrap;

import javax.faces.bean.ManagedBean;

@ManagedBean 
public class LoginBean {
	private String userName;
	private String password;
	
	public LoginBean() {
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}