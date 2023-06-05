package com.main.Entity;

import java.sql.Blob;
import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String uname;
	private String ugender;
	private String umn;
	private String ucity;
	private int upincode;
	private String uemail;
	private String upwd;
	private String user_profile_picture;

	// private Blob user_profile_picture;
	public User() {
		super();

	}

	public String getUcity() {
		return ucity;
	}

	public void setUcity(String ucity) {
		this.ucity = ucity;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUgender() {
		return ugender;
	}

	public void setUgender(String ugender) {
		this.ugender = ugender;
	}

	public String getUmn() {
		return umn;
	}

	public void setUmn(String umn) {
		this.umn = umn;
	}

	public int getUpincode() {
		return upincode;
	}

	public void setUpincode(int upincode) {
		this.upincode = upincode;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	
	

	public String getUser_profile_picture() {
		return user_profile_picture;
	}

	public void setUser_profile_picture(String user_profile_picture) {
		this.user_profile_picture = user_profile_picture;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", ugender=" + ugender + ", umn=" + umn + ", ucity=" + ucity
				+ ", upincode=" + upincode + ", uemail=" + uemail + ", upwd=" + upwd + ", user_profile_picture="
				+ user_profile_picture + "]";
	}

	
}