package com.rays.service;

import com.rays.Dto.UserDTO;

public interface UserServiceInt {

	public long add(UserDTO dto);
	public void delete(int id);
	public void update(UserDTO dto);
	
	
}
