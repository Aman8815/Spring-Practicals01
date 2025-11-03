package com.rays.service;

import javax.transaction.Transactional;
import org.springframework.transaction.annotation.Propagation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.rays.Dao.UserDAOImp;
import com.rays.Dao.UserDAOInt;
import com.rays.Dto.UserDTO;

@Service
public class UserServiceImp implements UserServiceInt {
	@Autowired
	private UserDAOInt dao;
    

	public long add(UserDTO dto) {
		long pk = dao.add(dto);
		return pk;
	}


	public void delete(int id) {
		dao.delete(id);
		
	}


	public void update(UserDTO dto) {
		dao.update(dto);
		
	}

	
	

}
