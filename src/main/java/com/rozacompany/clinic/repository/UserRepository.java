package com.rozacompany.clinic.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.CrudRepository;

import com.rozacompany.clinic.entity.User;

public interface UserRepository extends CrudRepository<User, Serializable>{

//	@Query("select u from User u where u.email=?1 and u.password=?2")
//	User login(String email, String password);
//
//	User findByEmailAndPassword(String email, String password);

	@EntityGraph(value="User.roles", type=EntityGraphType.LOAD)
	User findByUsername(String username);

}
