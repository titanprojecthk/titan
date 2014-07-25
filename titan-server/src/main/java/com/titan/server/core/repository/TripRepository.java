package com.titan.server.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.titan.server.core.domain.Trip;
import com.titan.server.core.domain.User;

public interface TripRepository extends CrudRepository<Trip, Integer> {
	
	public List<Trip> findByUser(User user);

}
