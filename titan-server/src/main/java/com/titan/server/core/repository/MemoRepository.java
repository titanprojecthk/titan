package com.titan.server.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.titan.server.core.domain.Memo;

public interface MemoRepository extends PagingAndSortingRepository<Memo, Integer> {

}