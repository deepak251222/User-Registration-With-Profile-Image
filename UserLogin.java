package com.main.Entity;

public class UserLogin {
	
	private String ulemail;
	private String ulpwd;
	
	
	public UserLogin(String ulemail, String ulpwd) {
		super();
		this.ulemail = ulemail;
		this.ulpwd = ulpwd;
	}
	public String getUlemail() {
		return ulemail;
	}
	public void setUlemail(String ulemail) {
		this.ulemail = ulemail;
	}
	public String getUlpwd() {
		return ulpwd;
	}
	public void setUlpwd(String ulpwd) {
		this.ulpwd = ulpwd;
	}
	

}
