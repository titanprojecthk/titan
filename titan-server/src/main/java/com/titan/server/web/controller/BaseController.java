package com.titan.server.web.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.titan.server.core.domain.District;
import com.titan.server.core.domain.User;
import com.titan.server.core.service.AttractionService;
import com.titan.server.core.service.CityService;
import com.titan.server.core.service.TripService;
import com.titan.server.core.service.UserService;

public class BaseController {
	
	@Autowired
	protected UserService userService;
	
	@Autowired
	protected TripService tripService;
	
	@Autowired
	protected CityService cityService;
	
	@Autowired
	protected AttractionService attractionService;

	protected User loadSessionUser() {
		return userService.find(1);
	}
}
