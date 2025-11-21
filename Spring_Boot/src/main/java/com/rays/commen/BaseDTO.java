package com.rays.commen;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public class BaseDTO {
	@Id
	@GeneratedValue(generator = "ncspk")
	@GenericGenerator(name = "ncspk",strategy = "native")
	@Column(name="id",nullable = false,unique = true)
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
