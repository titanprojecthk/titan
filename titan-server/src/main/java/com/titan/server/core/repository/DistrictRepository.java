package com.titan.server.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.titan.server.core.domain.District;

public interface DistrictRepository extends PagingAndSortingRepository<District, Integer> {

}