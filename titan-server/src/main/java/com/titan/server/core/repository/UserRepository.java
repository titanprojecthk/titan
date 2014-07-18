package com.titan.server.core.repository;

import org.springframework.data.repository.CrudRepository;

import com.titan.server.core.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
