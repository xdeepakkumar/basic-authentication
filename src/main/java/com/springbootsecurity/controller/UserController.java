package com.springbootsecurity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootsecurity.entity.User;
import com.springbootsecurity.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return this.userService.saveUser(user);
	}
	
	@GetMapping("/")
	public String hello() {
		return "This is user dashboard";
	}
	 
}
