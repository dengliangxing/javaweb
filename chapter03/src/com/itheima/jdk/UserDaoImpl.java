package com.itheima.jdk;

public class UserDaoImpl implements UserDao{
	@Override
	public void addUser() {
		System.out.println("添加一个用户");
	}
	@Override
	public void deleteUser() {
		System.out.println("删除一个用户");
	}
}
