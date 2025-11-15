package com.rays.form;

import org.hibernate.validator.constraints.NotEmpty;

public class UserRegistractionForm {
	
	private int id = 0;
	@NotEmpty(message = "FirsName is Requaird")
	private String firstName;
	@NotEmpty(message = "lastName is Requaird")
	private String lastName;
	@NotEmpty(message = "login is Requaird")
	private String login;
	@NotEmpty(message = "password is Requaird")
	private String password;

	private String address;
	private int salary;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
