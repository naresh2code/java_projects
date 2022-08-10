package com.example.ums.pojo;

import java.util.ArrayList;
import java.util.List;



public class UserPojo {
	
	private String userName;
	private int age;
	private String userEmail;
	private String status;
	private int userId;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	private List<UserPojo> listEmp = new ArrayList<UserPojo>();
	  
	public List<UserPojo> getListEmp() {
		return listEmp;
	}
	 
	public void setListEmp(List<UserPojo> listEmp) {
		this.listEmp = listEmp;
	}
}
