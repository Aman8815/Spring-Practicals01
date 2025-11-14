package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user")
public class UserDTO {
     @Id
     @GeneratedValue(generator="ncspk")
     @GenericGenerator(name="ncspk",strategy = "native")
     @Column(name="id",nullable = false,unique = true)
	private long id;
     @Column(name="firstName", length = 50)
	private String firstName;
     @Column(name="lastName", length = 50)
	private String lastName;
     @Column(name="login", length = 50)
	private String login;
     @Column(name="password", length = 50)
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
