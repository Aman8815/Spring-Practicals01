package com.rays.service;

import java.util.List;

import com.rays.dto.UserDTO;

public interface UserServiceInt {
	
	public long add(UserDTO dto);
	public long update(UserDTO dto);
	public void delete(int id);
	public UserDTO findByPk(long id);
	public UserDTO findByLogin(String login);
	public UserDTO authonticate(String login , String password);
	public List<UserDTO> search(UserDTO dto , int pageNO , int pageSize);

}
