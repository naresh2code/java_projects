package com.example.ums.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ums.entity.User;
import com.example.ums.pojo.UserPojo;
import com.example.ums.repository.UserRepository;




@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	UserPojo userPojo = new UserPojo();
	
	
	
	@Override
	public UserPojo getUser(int userId) {
		// TODO Auto-generated method stub
		
		try {
			User user = userRepository.getReferenceById(userId);

			userPojo.setUserId(user.getUserId());
			userPojo.setUserName(user.getUserName());
			userPojo.setAge(user.getAge());
			userPojo.setUserEmail(user.getUserEmail());
			userPojo.setStatus("Employee id found");
		} catch (EntityNotFoundException e) {
			userPojo.setStatus("Employee Id not found");
		} catch (Exception e) {
			userPojo.setStatus("Please try again after some time");
		}

		return userPojo;
	}

	@Override
	public UserPojo createUser(UserPojo userPojo) {
		// TODO Auto-generated method stub
		
		System.out.println("From Service .........." + userPojo.getUserName());

		User user = new User();
		user.setUserName(userPojo.getUserName());
		user.setAge(userPojo.getAge());
		user.setUserEmail(userPojo.getUserEmail());

		userRepository.save(user);

		userPojo.setUserId(user.getUserId());

		// call dao or repository
		return userPojo;
	}

	

	@Override
	public UserPojo updateUser(UserPojo userPojo) {
		// TODO Auto-generated method stub
		

		User user = userRepository.getReferenceById(userPojo.getUserId());

		user.setUserName(userPojo.getUserName());
		user.setUserEmail(userPojo.getUserEmail());
		user.setAge(userPojo.getAge());

		return userPojo;
	}

	
	@Override
	public UserPojo deleteUser(int userId) {
		// TODO Auto-generated method stub
		
		userRepository.deleteById(userId);

		UserPojo userPojo = new UserPojo();
		userPojo.setUserId(userId);
		userPojo.setStatus("--user record deleted- ");
		return userPojo;
	}
	
	
	@Override
	public UserPojo getAllUsers() {
		// TODO Auto-generated method stub
		
		UserPojo userPojo = new UserPojo();

		List<User> userList = new ArrayList<>();
		List<UserPojo> userListPojo = new ArrayList<>();

		try {
			userList = userRepository.findAll();

			for (User user : userList) {
				UserPojo userPojoObj = new UserPojo();

				userPojoObj.setUserId(user.getUserId());
				userPojoObj.setUserName(user.getUserName());
				userPojoObj.setAge(user.getAge());
				userPojoObj.setUserEmail(user.getUserEmail());
				userListPojo.add(userPojoObj);
			}

			userPojo.setListEmp(userListPojo);

		} catch (Exception e) {
			userPojo.setStatus("Please try again after some time");
		}

		return userPojo;
	}

	@Override
	public List<UserPojo> getUserByNameWithLike(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
