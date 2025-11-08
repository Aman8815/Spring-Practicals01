package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rays.dao.UserDAOImp;
import com.rays.dto.UserDTO;
@Service
public class UserServiceImp  implements UserServiceInt{
     @Autowired
	private UserDAOImp dao;
	public long add(UserDTO dto) {
		int pk = (int) dao.add(dto);
		return pk ;
	}

	public void update(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}

	public void delete(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}

	public UserDTO findByPk(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO findByLogin(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO authenticate(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
