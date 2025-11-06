package com.rays.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;
@Repository
public class UserDAOImpl implements UserDAOInt{
	@Autowired
	private SessionFactory sessionFactory = null;

	public long add(UserDTO dto) {
		
		Session session = sessionFactory.getCurrentSession();
		
		long pk = (Long)session.save(dto);
		return pk;
	}

	public long update(UserDTO dto) {
		
		Session session = sessionFactory.getCurrentSession();
		   session.update(dto);
		   System.out.println("data UPdate succefully");
		   return 0;
		 
			
		
	}

	public void delete(UserDTO dto) {
		Session session = sessionFactory.getCurrentSession();
		
		session.delete(dto);
		System.out.println("data Delete successfully");
		
	}

}
