package com.example.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ums.pojo.UserPojo;
import com.example.ums.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserRestController {

	@Autowired
	UserService userService;
	
	//insert user record
	@PostMapping(path = "/createUser", consumes = "application/json", produces = "application/json")
	public UserPojo createUser(@RequestBody UserPojo userPojo) {
		System.out.println(userPojo.getUserName());
		System.out.println(userPojo.getAge());
		System.out.println(userPojo.getUserEmail());
		userService.createUser(userPojo);
		return userPojo;
	}
	
	//Retrieve user details by using user id
	@GetMapping(path = "/getUser/{id}", produces = "application/json")
	public UserPojo getemp(@PathVariable Integer id) {
	  
		UserPojo userPojo = userService.getUser(id); 
	  
		return userPojo; 
	}
	
	 
	@PutMapping(path = "/updateUser", consumes = "application/json", produces ="application/json") 
	public UserPojo updateUser(@RequestBody UserPojo userPojo) {
		
		  userService.updateUser(userPojo);
		  userPojo=userService.getUser(userPojo.getUserId()); 
	
		  return userPojo; 
	}
	
	//delete user
	@DeleteMapping(path = "/deleteUser/{userId}", produces = "application/json")
	public UserPojo deleteEmp(@PathVariable Integer userId) { 
		  UserPojo userPojo = userService.deleteUser(userId);
		  return userPojo;
	}
	
	@GetMapping(path = "/listUser", produces = "application/json") 
	  public UserPojo listUser() {
	  
		UserPojo userPojo = userService.getAllUsers(); 
		  return userPojo; 
	  }
	  
}
