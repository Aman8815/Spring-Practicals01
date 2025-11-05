package com.rays.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rays.Dto.UserDTO;

public class NewMapper implements RowMapper<UserDTO> {

	public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserDTO dto = new UserDTO();
		 dto.setId(rs.getInt(1));
		 dto.setFirstName(rs.getString(2));
		 dto.setLastName(rs.getString(3));
		 dto.setLogin(rs.getString(4));
		 dto.setPassword(rs.getString(5));
		return dto;
	}

}
