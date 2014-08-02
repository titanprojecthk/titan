package com.titan.server.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.titan.server.core.domain.City;

@RestController
public class CityController extends BaseController {
	
	@RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
	public City get(@PathVariable Integer id) {
		return cityService.find(id);
	}
}
