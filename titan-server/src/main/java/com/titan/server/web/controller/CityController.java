package com.titan.server.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.titan.server.core.service.CityService;
import com.titan.server.web.model.CityVo;

@RestController
public class CityController {
	
	@Autowired
	private CityService cityService;

	@RequestMapping(value = "/city/{cityId}", method = RequestMethod.GET)
	public CityVo get(@PathVariable Integer cityId) {
		return cityService.find(cityId);
	}
}
