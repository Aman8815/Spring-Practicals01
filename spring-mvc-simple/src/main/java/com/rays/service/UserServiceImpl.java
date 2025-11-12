package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;
@Service
public class UserServiceImpl implements UserServiceInt {
    @Autowired
	public UserDAOInt dao;
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public long add(UserDTO dto) {
		// TODO Auto-generated method stub
		return dao.add(dto) ;
	}

	@Override
	public long update(UserDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDTO findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO findByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO authonticate(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> search(UserDTO dto, int pageNO, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
