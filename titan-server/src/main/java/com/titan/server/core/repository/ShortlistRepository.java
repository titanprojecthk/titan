package com.titan.server.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.titan.server.core.domain.Shortlist;

public interface ShortlistRepository extends PagingAndSortingRepository<Shortlist, Integer> {

}