package com.rays.dao;

import com.rays.dto.UserDTO;

public interface UseDAOInt {
	
	public long add(UserDTO dto);
	public void update(UserDTO dto);
	public void delete(UserDTO dto);
	public UserDTO findByPk(UserDTO dto);
	public UserDTO findByLogin(UserDTO dto);
	public UserDTO authenticate(UserDTO dto);
	

}
