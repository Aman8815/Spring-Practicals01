package com.rays.form;

import org.hibernate.validator.constraints.NotEmpty;

public class AddUserForm {

	private long id;
	@NotEmpty(message = "FirstName is Requird")
	private String FirstName;
	@NotEmpty(message = "lastName is Requird")
	private String lastName;
	@NotEmpty(message = "Login is Requird")
	private String Login;
	@NotEmpty(message = "password is Requird")
	private String password;
	private long[] ids;
	private int pageNo;
	private int next;

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long[] getIds() {
		return ids;
	}

	public void setIds(long[] ids) {
		this.ids = ids;
	}

}
