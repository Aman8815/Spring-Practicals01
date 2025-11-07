package com.rays.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;
@Service
public class UserServiceImpl implements UserServiceInt{
	@Autowired
	private UserDAOInt dao;
    @Transactional(propagation = Propagation.REQUIRED)
	public long add(UserDTO dto) {
		// TODO Auto-generated method stub
		return dao.add(dto) ;
	}
    @Transactional(propagation = Propagation.REQUIRED)
	public long update(UserDTO dto) {
	   
		return dao.update(dto);
		
	}
    @Transactional(propagation = Propagation.REQUIRED)
	public void delete(UserDTO dto) {
		dao.delete(dto);
		
	}
    @Transactional(readOnly = true)
	public UserDTO findBypk(long pk) {
		// TODO Auto-generated method stub
		return dao.findBypk(pk);
	}
    @Transactional(readOnly = true)
	public UserDTO findByLogin(String login) {
		// TODO Auto-generated method stub
		return dao.findByLogin(login);
	}
    @Transactional(readOnly = true)
	public UserDTO authanticate(String login, String password) {
		// TODO Auto-generated method stub
		return dao.authanticate(login, password);
	}
    @Transactional(readOnly = true)
	public List search(UserDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return dao.search(dto, pageNo, pageSize);
	}

}
