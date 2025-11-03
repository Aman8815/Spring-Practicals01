package com.rays.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rays.Dto.UserDTO;
@Repository
public class UserDAOImp  implements UserDAOInt{
	
	private JdbcTemplate jdbcTemplete;
	
	private DataSource datasource = null;
	
   @Autowired
	public void setDatasource(DataSource datasource) {
		this.jdbcTemplete = new JdbcTemplate(datasource);
	}

	public long add(UserDTO dto) {
		
		String sql = "insert into st_user values(?,?,?,?,?)";
		int pk = jdbcTemplete.update(sql,dto.getId(),dto.getFirstName(),dto.getLastName(),dto.getLastName(),dto.getPassword());
		
		return pk;
	}

	public void update(UserDTO dto) {
		// TODO Auto-generated method stub
		String sql =  "UPDATE st_user SET firstName = ?,lastName = ?,login=?,password=? WHERE id = ?";
		int num = jdbcTemplete.update(sql,dto.getFirstName(),dto.getLastName(),dto.getLogin(),dto.getPassword(),dto.getId());
		
		if(num>0) {
		System.out.println("Data UPdate successfully");
		}else {
			System.out.println("id is not in database");
		}
	}

	public void delete(int id) {
		
		String sql = "DELETE FROM st_user WHERE id = ?";
		
		int num = jdbcTemplete.update(sql,id);
		
		if(num>0) {
		System.out.println("Delete Succesfully");
		}
		else {
			System.out.println("id is not in database");
		}
		
	}


}
