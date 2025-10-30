package com.rays.by_name;

public class UserService {
  
	private UserDaoInt userDao;
	
	public void setuserDao(UserDaoInt userDao) {
		this.userDao = userDao;
	}
	
	public void TestAdd() {
		userDao.add();
	}
}
