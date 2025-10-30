package com.rays.no_type;

public class UserService {
	
	private UserDAOInt userDao;
	
	public void setuserDao(UserDAOInt userDao) {
		this.userDao = userDao;
	}
	
	public void Testadd() {
		userDao.add();
	}

}
