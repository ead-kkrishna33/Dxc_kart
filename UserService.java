package com.dxc.service;

import java.util.Optional;

import com.dxc.model.User;

public interface UserService {

	public boolean AddUser(User userInfo) ;
	public User GetUserByUserName(String userName);
	public boolean validateUser(String UserName, String password);	
}
