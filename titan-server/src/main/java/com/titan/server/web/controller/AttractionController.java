package com.titan.server.web.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.titan.server.core.domain.Attraction;
import com.titan.server.core.domain.User;


@RestController
public class AttractionController extends BaseController {

	@RequestMapping(value = "/attraction/{attractionId}", method = RequestMethod.GET)
	public Attraction get(@PathVariable Integer attractionId) {
		return attractionService.find(attractionId);
	}
	
	@RequestMapping(value = "/attraction/list/{pageNo}/{pageSize}", method = RequestMethod.GET)
	public Page<Attraction> list(@PathVariable Integer pageNo, @PathVariable Integer pageSize) {
		return attractionService.findAll(pageNo, pageSize);
	}
	
	@RequestMapping(value = "/attraction", method = RequestMethod.POST)
	public Attraction save(@RequestBody Attraction attraction) {
		User user = loadSessionUser();
		return attractionService.save(attraction, user);
	}
	
	@RequestMapping(value = "/attraction/find", method = RequestMethod.POST)
	public Page<Attraction> findByDistrictAndType() {
		//TODO: implement
		return null;
	}
}
