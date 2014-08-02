package com.titan.server.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.titan.server.core.domain.Attraction;

public interface AttractionRepository extends PagingAndSortingRepository<Attraction, Integer> {

}
