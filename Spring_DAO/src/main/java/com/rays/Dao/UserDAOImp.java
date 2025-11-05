package com.rays.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rays.Dto.UserDTO;

@Repository
public class UserDAOImp implements UserDAOInt {

	private JdbcTemplate jdbcTemplete;

	private DataSource datasource = null;

	@Autowired
	public void setDatasource(DataSource datasource) {
		this.jdbcTemplete = new JdbcTemplate(datasource);
	}

	public long add(UserDTO dto) {

		String sql = "insert into st_user values(?,?,?,?,?)";
		int pk = jdbcTemplete.update(sql, dto.getId(), dto.getFirstName(), dto.getLastName(), dto.getLastName(),
				dto.getPassword());

		return pk;
	}

	public void update(UserDTO dto) {
		// TODO Auto-generated method stub
		String sql = "UPDATE st_user SET firstName = ?,lastName = ?,login=?,password=? WHERE id = ?";
		int num = jdbcTemplete.update(sql, dto.getFirstName(), dto.getLastName(), dto.getLogin(), dto.getPassword(),
				dto.getId());

		if (num > 0) {
			System.out.println("Data UPdate successfully");
		} else {
			System.out.println("id is not in database");
		}
	}

	public void delete(int id) {

		String sql = "DELETE FROM st_user WHERE id = ?";

		int num = jdbcTemplete.update(sql, id);

		if (num > 0) {
			System.out.println("Delete Succesfully");
		} else {
			System.out.println("id is not in database");
		}

	}

	public UserDTO findByLogin(String login) {
		// TODO Auto-generated method stub
		String sql = "select * from st_user where login =?";

		Object[] parms = { login };

		UserDTO dto = jdbcTemplete.queryForObject(sql, parms, new NewMapper());
		return dto;
	}

	public UserDTO authenticate(String gmail, String password) {
		String sql = "select * from st_user where login =? and password =?";

		Object[] parms = { gmail,password };

		UserDTO dto = jdbcTemplete.queryForObject(sql, parms, new NewMapper());
		return dto;
	}

	public List search() {
		// TODO Auto-generated method stub
	String sql = "select * from st_user";
		List list = jdbcTemplete.query(sql,new NewMapper());
			return list;
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		
		StringBuilder sql = new StringBuilder("select * from st_user where 1=1");
		if (dto != null) {
			if (dto.getFirstName() != null && dto.getFirstName().length() > 0) {
				sql.append(" and firstName like '" + dto.getFirstName() + "%'");
			}
		}

		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append(" limit " + pageNo + ", " + pageSize);
		}
		System.out.println("sql===> " + sql.toString());
		List l = jdbcTemplete.query(sql.toString(), new NewMapper());
		return l;
	}

}
