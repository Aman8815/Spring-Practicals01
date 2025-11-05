package com.rays.service;

import java.util.List;

import com.rays.Dto.EmployeeDTO;

public interface EmployeeServiceInt {
	
	public long add(EmployeeDTO dto);
	public long update();
	public void delete();
	public EmployeeDTO findbylogin(String login);
	public EmployeeDTO authenticate(String login,String password);
	public List search();
	public List search(EmployeeDTO dto,int pageNO,int pageSize);

}
