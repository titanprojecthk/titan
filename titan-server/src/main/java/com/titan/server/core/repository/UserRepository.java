package com.titan.server.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.titan.server.core.domain.User;

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {

}
