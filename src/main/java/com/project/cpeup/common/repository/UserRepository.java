package com.project.cpeup.common.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.cpeup.common.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByUsername(String username);
}
