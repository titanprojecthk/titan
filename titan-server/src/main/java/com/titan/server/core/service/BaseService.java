package com.titan.server.core.service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;

import com.titan.server.core.domain.District;
import com.titan.server.core.repository.CityRepository;
import com.titan.server.core.repository.DistrictRepository;
import com.titan.server.core.repository.TripRepository;
import com.titan.server.core.repository.UserRepository;

public class BaseService {
	
	@Autowired 
	protected TripRepository tripRepository;
	
	@Autowired
	protected UserRepository userRepository;
	
	@Autowired
	protected CityRepository cityRepository;
	
	@Autowired
	protected DistrictRepository districtRepository;

  	protected Timestamp getCurrentTime() {
		return new Timestamp(GregorianCalendar.getInstance().getTime().getTime());
	}
	
  	protected District getPositionDistrict(BigDecimal lng, BigDecimal lat) {
		//TODO: get by position
		return districtRepository.findOne(1);
	}
	
}
