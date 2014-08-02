package com.titan.server.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.titan.server.core.domain.TripShortlist;

public interface TripShortlistRepository extends PagingAndSortingRepository<TripShortlist, Integer> {

}