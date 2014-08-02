package com.titan.server.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.titan.server.core.domain.Content;

public interface ContentRepository extends PagingAndSortingRepository<Content, String> {

}