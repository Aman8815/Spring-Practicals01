package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.Dao.EmployeeDAOImp;
import com.rays.Dao.EmployeeDAOInt;
import com.rays.Dto.EmployeeDTO;
@Service
public class EmployeeSeriveImp implements EmployeeServiceInt {
     @Autowired
	private EmployeeDAOInt dao;
	@Transactional(propagation = Propagation.REQUIRED)
	public long add(EmployeeDTO dto) {
		// TODO Auto-generated method stub
		return dao.add(dto);
	}

	public long update() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public EmployeeDTO findbylogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeDTO authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search() {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(EmployeeDTO dto, int pageNO, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
