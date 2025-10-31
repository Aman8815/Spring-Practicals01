package com.rays.annotationByautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDAOInt UserDao;
	
	public void setUserDao(UserDAOInt UserDao) {
		this.UserDao = UserDao;
		
	}
	
	public void testadd() {
		UserDao.add();
	}

}
