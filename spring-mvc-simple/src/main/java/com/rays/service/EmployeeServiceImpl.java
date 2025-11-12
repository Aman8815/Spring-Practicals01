package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.EmployeeDAOInt;
import com.rays.dto.EmployeeDTO;
@Service
public class EmployeeServiceImpl implements EmployeeServiceInt {

	 @Autowired  
	public EmployeeDAOInt dao;
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public long add(EmployeeDTO dto) {
		
		return dao.add(dto);
	}

	@Override
	public void update(EmployeeDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeDTO findbypk(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO findbylogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDTO> search(EmployeeDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
