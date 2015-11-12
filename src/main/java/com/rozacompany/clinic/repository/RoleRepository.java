package com.rozacompany.clinic.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rozacompany.clinic.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Serializable>
{

}
