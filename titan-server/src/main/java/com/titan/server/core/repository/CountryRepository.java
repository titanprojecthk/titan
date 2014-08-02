package com.titan.server.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.titan.server.core.domain.Country;

public interface CountryRepository extends PagingAndSortingRepository<Country, Integer> {

}