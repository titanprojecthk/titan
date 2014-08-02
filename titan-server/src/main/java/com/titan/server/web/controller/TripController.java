package com.titan.server.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.titan.server.core.domain.Trip;

@RestController
public class TripController extends BaseController {
	
	@RequestMapping(value = "/trip/{cityId}", method = RequestMethod.GET)
	public Trip getDefaultTrip(@PathVariable Integer cityId) {
		Integer userId = 1;
		return tripService.findTripByCityAndUser(cityId, userId);
	}

}
