package com.titan.server.core.repository;

import org.springframework.data.repository.CrudRepository;

import com.titan.server.core.domain.City;

public interface CityRepository extends CrudRepository<City, Integer> {

}
