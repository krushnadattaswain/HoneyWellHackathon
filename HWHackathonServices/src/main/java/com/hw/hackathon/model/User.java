package com.hw.hackathon.model;

import java.util.List;

public class User {

	private String name;
	private String pwd;
	private String location;
	private List<String> intersts;
	private String tel;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getIntersts() {
		return intersts;
	}
	public void setIntersts(List<String> intersts) {
		this.intersts = intersts;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
