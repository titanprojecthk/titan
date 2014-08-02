package com.titan.server.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.titan.server.core.domain.City;

public interface CityRepository extends PagingAndSortingRepository<City, Integer> {

}
