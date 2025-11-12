package com.rays.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.dto.EmployeeDTO;
@Repository
public class EmployeeDAOImpl  implements EmployeeDAOInt{
    @Autowired
	public SessionFactory sessionFactory;
	@Override
	public long add(EmployeeDTO dto) {
		Session session = sessionFactory.getCurrentSession();
		  
		int pk = (int) session.save(dto);
		return pk;
	}

	@Override
	public void update(EmployeeDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeDTO findbypk(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO findbylogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDTO> search(EmployeeDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
