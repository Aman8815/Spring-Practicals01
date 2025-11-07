package com.rays.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAOInt {
	@Autowired
	private SessionFactory sessionFactory = null;

	public long add(UserDTO dto) {

		Session session = sessionFactory.getCurrentSession();

		long pk = (Long) session.save(dto);
		return pk;
	}

	public long update(UserDTO dto) {

		Session session = sessionFactory.getCurrentSession();
		session.update(dto);
		System.out.println("Data Update Succefully");
		return 0;

	}

	public void delete(UserDTO dto) {
		Session session = sessionFactory.getCurrentSession();

		session.delete(dto);
		System.out.println("Data Delete Successfully");

	}

	public UserDTO findBypk(long pk) {

		return sessionFactory.getCurrentSession().get(UserDTO.class, pk);
	}

	public UserDTO findByLogin(String login) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);
		criteria.add(Restrictions.eq("login", login));
		List list = null;
		list = criteria.list();
		UserDTO dto = null;
		if (list.size() == 1) {
			dto = (UserDTO) list.get(0);
		}
		return dto;
	}

	public UserDTO authanticate(String login, String password) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);
		criteria.add(Restrictions.eq("login", login));
		criteria.add(Restrictions.eq("password",password));
		List list = null;
		list = criteria.list();
		UserDTO dto = null;
		if (list.size() == 1) {
			dto = (UserDTO) list.get(0);
		}
		return dto;
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);
		
		if(dto != null) {
			if(dto.getFirstName()!=null && dto.getFirstName().length()>0) {
				criteria.add(Restrictions.like("firstName",dto.getFirstName()));
			}
		}
		
		if(pageNo ==0) {
			criteria.setFirstResult(pageNo);
			criteria.setMaxResults(pageSize);
		}
		
		List list = criteria.list();
		
		return list;
	}

}
