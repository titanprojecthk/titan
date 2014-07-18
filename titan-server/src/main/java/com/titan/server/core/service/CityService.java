package com.titan.server.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.titan.server.core.domain.City;
import com.titan.server.core.repository.CityRepository;
import com.titan.server.web.model.CityVo;
import com.titan.server.web.model.CountryVo;

@Component
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;

	public CityVo find(Integer id) {
		City city = cityRepository.findOne(id);
		if (city != null) {
			CityVo vo = new CityVo();
			vo.setName(city.getName());
			
			CountryVo countryVo = new CountryVo();
			countryVo.setCode(city.getCountry().getCode());
			countryVo.setName(city.getCountry().getName());
			vo.setCountry(countryVo);
			
			return vo;
		}
		
		return null;
	}
}
