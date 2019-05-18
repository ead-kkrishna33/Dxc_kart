package com.dxc.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.model.User;

public interface UserRepository extends MongoRepository<User,String>{
	
	//public User findByName(String userName);

}
