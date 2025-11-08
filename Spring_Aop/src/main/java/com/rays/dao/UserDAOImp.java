package com.rays.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.w3c.dom.UserDataHandler;

import com.rays.dto.UserDTO;
@Repository
public class UserDAOImp  implements UseDAOInt{
	@Autowired
    private SessionFactory sessionFactory;

	public long add(UserDTO dto) {
		Session session = sessionFactory.getCurrentSession();
		int pk = (Integer) session.save(dto);
		return pk;
		
	}

	public void update(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}

	public void delete(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}

	public UserDTO findByPk(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO findByLogin(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO authenticate(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}


}
