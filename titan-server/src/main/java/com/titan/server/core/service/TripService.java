package com.titan.server.core.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.titan.server.core.domain.City;
import com.titan.server.core.domain.Trip;
import com.titan.server.core.domain.User;

@Component
public class TripService extends BaseService {
	
	public Trip findTripByUser(User user) {
		List<Trip> trips = tripRepository.findByUser(user);
		return trips.isEmpty() ? null : trips.get(0);
	}
	
	public Trip findTripByCityAndUser(Integer cityId, Integer userId) {
		City city = cityRepository.findOne(cityId);
		User user = userRepository.findOne(userId);
		
		if (city != null && user != null) {
			List<Trip> trips = tripRepository.findByCityAndUser(city, user);
			return trips.isEmpty() ? null : trips.get(0);
		}
		
		return null;
	}

}
