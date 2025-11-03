package com.rays.Dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rays.Dto.UserDTO;

public interface UserDAOInt {
	
    public long add(UserDTO dto);
	public void update(UserDTO dto);
	public void delete(int id);

}
