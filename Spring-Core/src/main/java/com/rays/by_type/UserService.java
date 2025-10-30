package com.rays.by_type;

public class UserService {
	
	private UserDAOImp userDao;
	
	public void setuserDao(UserDAOImp userDao) {
		this.userDao = userDao;
		
	}
	
	public void tesAdd() {
		userDao.add();
	}

}
