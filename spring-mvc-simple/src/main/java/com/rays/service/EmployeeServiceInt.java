package com.rays.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.rays.dto.EmployeeDTO;

public interface EmployeeServiceInt {
  
	public long add(EmployeeDTO dto) throws DataAccessException;
	public void update(EmployeeDTO dto);
	public void delete(int id);
	public EmployeeDTO findbypk(int id);
	public EmployeeDTO findbylogin(String login);
	public List<EmployeeDTO> search(EmployeeDTO dto , int pageNo , int pageSize);

}
