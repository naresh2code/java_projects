package com.example.ums.service;

import java.util.List;

import com.example.ums.pojo.UserPojo;


public interface UserService {
	UserPojo getUser(int userId);
	
	UserPojo createUser(UserPojo userPojo);
	
	UserPojo deleteUser(int userId);
	
	UserPojo updateUser(UserPojo userPojo);

	UserPojo getAllUsers();
    
	List<UserPojo>  getUserByNameWithLike(String userName);
}
