package com.itheima.ioc;

public class UserServiceImp implements UserService{
	private UserDao userDao;
	@Override
	public void say() {
		this.userDao.say();
		System.out.println("Service say hello world!");
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
