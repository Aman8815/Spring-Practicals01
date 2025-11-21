package com.rays.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.commen.BaseDTO;

@Entity
@Table(name="ST_ROLE")
public class RoleDTO extends BaseDTO{
	@Column(name="name",length = 50)
	private String name;
	@Column(name="Description",length = 50)
	private String Description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
