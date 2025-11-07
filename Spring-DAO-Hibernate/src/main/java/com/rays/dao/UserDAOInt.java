package com.rays.dao;

import java.util.List;

import com.rays.dto.UserDTO;

public interface UserDAOInt {
	
	public long add(UserDTO dto);
	public long update(UserDTO dto);
	public void delete(UserDTO dto);
	public UserDTO findBypk(long pk);
	public UserDTO findByLogin(String login);
	public UserDTO authanticate(String login,String password);
	public List search(UserDTO dto,int pageNo,int pageSize);

}
