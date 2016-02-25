package com.rozacompany.clinic.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.CrudRepository;

import com.rozacompany.clinic.entity.User;

public interface UserRepository extends CrudRepository<User, Serializable> {
	@EntityGraph(value = "User.roles.permissions", type = EntityGraphType.FETCH)
	User findByUsername(String username);

}
