package com.rays.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.aop.ThrowsAdvice;
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
		UserDAOImpl user = new UserDAOImpl();
		 session.save(dto);
		 return 0;
	
		
	}

	@Override
	public long update(UserDTO dto) {
		Session session = sessionFactory.getCurrentSession();
		
		session.update(dto);
		return 0;
	}

	@Override
	public UserDTO findByPk(long pk) {
		Session session = sessionFactory.getCurrentSession();
		
		UserDTO dto = null;
		dto = (UserDTO) sessionFactory.getCurrentSession().get(UserDTO.class, pk);
		return dto; 
		
	}

	@Override
	public UserDTO findByLogin(String login) {
		Session session = sessionFactory.getCurrentSession();
		UserDTO dto = null;
		Criteria criteria = session.createCriteria(UserDTO.class);
		 criteria.add(Restrictions.eq("login",login));
		List<UserDTO> list =criteria.list();
		System.out.println(list.size());
		if(list.size()>0) {
		dto = (UserDTO) list.get(0);
		}
		return dto;
	}

	@Override
	public UserDTO authonticate(String login, String password) {
		Session session = sessionFactory.getCurrentSession();
		UserDTO dto = null;
		Criteria criteria = session.createCriteria(UserDTO.class);
		 criteria.add(Restrictions.like("login",login));
		 criteria.add(Restrictions.like("password", password));
		 List<UserDTO> list = criteria.list();
		 dto =(UserDTO) list.get(0);
		return dto;
	}

	@Override
	public List<UserDTO> search(UserDTO dto, int pageNO, int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);
		
		if(dto != null) {
			
			if(dto.getFirstName()!=null&&dto.getFirstName().length()>0) {
				criteria.add(Restrictions.like("firstName",dto.getFirstName()));
			}
			if(dto.getLastName()!=null&&dto.getLastName().length()>0) {
				criteria.add(Restrictions.ilike("lastName",dto.getLastName()));
			}
			if(dto.getLogin()!=null&&dto.getLogin().length()>0) {
				criteria.add(Restrictions.like("login", dto.getLogin()));
			}
		}
		
		 pageNO = (pageNO-1)*pageSize;
			  
			criteria.setFirstResult(pageNO);
			criteria.setMaxResults(pageSize);
			
			 List<UserDTO> list = criteria.list();
			
		
		return list;
	}

	@Override
	public void delete(int id) {
		UserDTO dto = findByPk(id);
		sessionFactory.getCurrentSession().delete(dto);
		
		
	}

}
