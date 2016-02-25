/**
 * 
 */
package com.rozacompany.clinic.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Role extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String name;

	@ManyToMany
	@JoinTable(name = "Role_Permission", joinColumns = @JoinColumn(name = "role_id") , inverseJoinColumns = @JoinColumn(name = "permission_id") )
	private Set<Permission> permissions = new HashSet<Permission>();

	public Role() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}
}