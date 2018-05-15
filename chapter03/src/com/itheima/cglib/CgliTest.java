package com.itheima.cglib;

public class CgliTest {
	public static void main(String[] args) {
		Cglibproxy cglibProxy = new Cglibproxy();
		UserDao userDao = new UserDao();
		UserDao userDao1 = (UserDao) cglibProxy.createProxy(userDao);
		userDao1.addUser();
		userDao1.deleteUser();
		
	}
}
