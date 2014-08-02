package com.titan.server.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.titan.server.core.domain.Configuration;

public interface ConfigurationRepository extends PagingAndSortingRepository<Configuration, Integer> {


}
