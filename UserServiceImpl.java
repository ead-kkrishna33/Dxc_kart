package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.User;
import com.dxc.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User GetUserByUserName(String userName) {
		List<User> users = userRepository.findAll();
		User user = new User();
		for(int i = 0; i < users.size(); i++) {
			 if(users.get(i).getUserName().equals(userName) )
			 {
				 user = users.get(i);
				 break;
			 }
		}
		return user;
	}
	@Override
	public boolean AddUser(User userInfo) {
		boolean status = false;
		try {
			userRepository.save(userInfo);
			status = true;
		}
		catch(Exception e) {
			
		}
		return status;
	}
	@Override
	public boolean validateUser(String UserName, String password) {
		boolean isValidUser = false;
		List<User> users=userRepository.findAll();
		
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getUserName().equals(UserName) && users.get(i).getPassword().equals(password)){
				isValidUser = true;
				break;
			}
		
		}
    	return isValidUser;
	}


	

}
