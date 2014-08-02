package com.titan.server.core.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.titan.server.core.domain.User;
import com.titan.server.core.repository.UserRepository;

@Component
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Transactional
	public User find(Integer id) {
		User user =  userRepository.findOne(id);
		return user;
	}
	
	@Transactional
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		for (User user : userRepository.findAll()) {
			users.add(user);
		}
		return users;
	}
}
