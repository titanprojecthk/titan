package com.titan.server.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.titan.server.core.domain.City;
import com.titan.server.core.repository.CityRepository;

@Component
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;

	public City find(Integer id) {
		return cityRepository.findOne(id);
	}
	
	public City getDefaultCity() {
		return cityRepository.findAll().iterator().next();
	}
}
