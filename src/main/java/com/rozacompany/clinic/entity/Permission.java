package com.rozacompany.clinic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Permission extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, unique = true)
	private String name;
	@Column(nullable = false)
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
