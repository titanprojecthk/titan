package com.titan.server.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.titan.server.core.domain.Trip;
import com.titan.server.core.domain.User;
import com.titan.server.core.mapper.TripMapper;
import com.titan.server.core.repository.TripRepository;
import com.titan.server.core.repository.UserRepository;
import com.titan.server.web.model.TripVo;
import com.titan.server.web.model.UserVo;

@Component
public class TripService {
	
	@Autowired 
	private TripRepository tripRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public TripVo findTripByUser(UserVo userVo) {
		User user = userRepository.findOne(1); //temp hardcoded user id
		if (user != null) {
			List<Trip> trips = tripRepository.findByUser(user);
			if (trips != null && !trips.isEmpty()) {
				return TripMapper.map(trips.get(0));
			}
		}
		
		return null;
	}

}
