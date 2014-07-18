package com.titan.server.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.titan.server.core.domain.User;
import com.titan.server.core.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	public User get(@PathVariable Integer userId) {
		return userService.find(userId);
	}

	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	public List<User> list() {
		return userService.findAll();
	}
}
