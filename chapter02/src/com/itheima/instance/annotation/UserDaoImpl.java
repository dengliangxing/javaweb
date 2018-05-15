package com.itheima.instance.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	@Override
	public void say() {
		System.out.println("userdao ..... say....");
	}
}
