package com.titan.server.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.titan.server.core.service.TripService;
import com.titan.server.web.model.TripVo;
import com.titan.server.web.model.UserVo;

@RestController
public class TripController {
	
	@Autowired
	private TripService tripService;
	
	@RequestMapping(value = "/trip", method = RequestMethod.GET)
	public TripVo get() {
		return tripService.findTripByUser(new UserVo());
	}

}
