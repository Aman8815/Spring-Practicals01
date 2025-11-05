package com.rays.Dao;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rays.Dto.UserDTO;

public interface UserDAOInt {
	
    public long add(UserDTO dto);
	public void update(UserDTO dto);
	public void delete(int id);
	public UserDTO findByLogin(String login);
	public UserDTO authenticate (String gmail , String password);
	public List search();
	public List search(UserDTO dto,int pageNo,int pageSize);

}
