package com.rays.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rays.Dto.EmployeeDTO;
@Repository
public class EmployeeDAOImp implements EmployeeDAOInt{
	   private JdbcTemplate jdbcTemplate;
	   private DataSource datasource = null;
	   @Autowired
	   public void setdatasource(DataSource datasource) {
		   this.jdbcTemplate = new JdbcTemplate(datasource);
	   }
	   

	public long add(EmployeeDTO dto) {
		String sql = "insert into employee values(?,?,?,?,?)";
		 long p = jdbcTemplate.update(sql,dto.getId(),dto.getFirstName(), dto.getLastName(), dto.getLastName(),
					dto.getPassword());
		return p;
	}

	public long update() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public EmployeeDTO findbylogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeDTO authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search() {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(EmployeeDTO dto, int pageNO, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
