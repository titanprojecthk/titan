package com.titan.server.core.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.titan.server.core.domain.City;
import com.titan.server.core.domain.Trip;
import com.titan.server.core.domain.User;

public interface TripRepository extends PagingAndSortingRepository<Trip, Integer> {
	
	public List<Trip> findByUser(User user);
	
	public List<Trip> findByCityAndUser(City city, User user);

}
