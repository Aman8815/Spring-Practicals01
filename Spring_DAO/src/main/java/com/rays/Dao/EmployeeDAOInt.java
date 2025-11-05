package com.rays.Dao;

import java.util.List;

import com.rays.Dto.EmployeeDTO;

public interface EmployeeDAOInt {
	
	public long add(EmployeeDTO dto);
	public long update();
	public void delete();
	public EmployeeDTO findbylogin(String login);
	public EmployeeDTO authenticate(String login,String password);
	public List search();
	public List search(EmployeeDTO dto,int pageNO,int pageSize);
	

}
