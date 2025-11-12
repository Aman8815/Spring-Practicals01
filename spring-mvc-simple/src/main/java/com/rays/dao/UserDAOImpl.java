package com.rays.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;
@Repository
public class UserDAOImpl  implements UserDAOInt{
      @Autowired
	public SessionFactory sessionFactory;
	@Override
	public long add(UserDTO dto) {
		
		Session session = sessionFactory.getCurrentSession();
		
		int pk = (int) session.save(dto);
		return pk;
	}

	@Override
	public long update(UserDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDTO findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO findByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO authonticate(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> search(UserDTO dto, int pageNO, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
