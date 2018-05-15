package com.itheima.instance.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name = "userDao")
	private UserDao userDao;
	@Override
	public void say() {
		this.userDao.say();
		System.out.println("userservice.....save......");
	}
}
