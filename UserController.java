package com.dxc.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.User;
import com.dxc.service.UserService;


@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/get/{userName}")
	public User getuser(@PathVariable("userName") String userName) {		
		User user = userService.GetUserByUserName(userName);
		return user;
	}
	
	@PostMapping("/save")
	public boolean adduser(@RequestBody User userDetails) {			
		boolean staus = userService.AddUser(userDetails);
		return staus;
	}
	
	@PostMapping("/validate")
	public boolean validateUser(@RequestBody User userDetails) {			
	boolean staus = userService.validateUser(userDetails.getusername(),userDetails.getPassword());
	return staus;
	}

}


//
