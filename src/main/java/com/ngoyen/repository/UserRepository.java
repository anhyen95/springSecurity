package com.ngoyen.repository;

import org.springframework.data.repository.CrudRepository;

import com.ngoyen.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByEmail(String email);
	
}
