package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="st_Employee")
public class EmployeeDTO {
	@Id
	@GeneratedValue(generator = "ncspk")
	@GenericGenerator(name="ncspk", strategy = "native")
	@Column(name="id", unique = true,nullable = false)
	private int id;
	@Column(name="firstName" , length = 50)
	private String firstName;
	@Column(name="lastName", length = 50)
	private String lastName;
	@Column(name="login", length = 50)
	private String login;
	@Column(name="address" , length = 50)
	private String address;
	@Column(name="salary", nullable = false)
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
