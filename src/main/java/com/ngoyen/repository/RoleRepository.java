package com.ngoyen.repository;

import org.springframework.data.repository.CrudRepository;

import com.ngoyen.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

	Role findByName(String name);
	
}
