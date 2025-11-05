package com.rays.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.transaction.annotation.Propagation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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


	public UserDTO findByLogin(String login) {
		// TODO Auto-generated method stub
		
		return dao.findByLogin(login);
	}


	public UserDTO authenticate(String gmail, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(gmail, password);
	}


	public List search() {
		// TODO Auto-generated method stub
		return dao.search();
	}


	public List search(UserDTO dto, int pageNo, int PageSize) {
		
		return dao.search(dto, pageNo, PageSize);
	}

	
	

}
