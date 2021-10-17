package com.springbootsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springbootsecurity.entity.User;
import com.springbootsecurity.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public User saveUser(User user) {
		user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRole("USER");
		return this.userRepository.save(user);
	}
}
