package com.rays.service;

import java.util.List;

import com.rays.Dto.UserDTO;

public interface UserServiceInt {

	public long add(UserDTO dto);
	public void delete(int id);
	public void update(UserDTO dto);
	public UserDTO findByLogin(String login);
	public UserDTO authenticate(String gmail,String password);
	public List search();
	
	
}
