package com.rays.serivce;

import com.rays.dto.UserDTO;

public interface UserServiceInt {
	
	public long add(UserDTO dto);
	public long update(UserDTO dto);
	public void delete(UserDTO dto);

}
