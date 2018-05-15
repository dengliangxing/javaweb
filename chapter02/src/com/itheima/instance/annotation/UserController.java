package com.itheima.instance.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {
	@Resource(name="userService")
	private UserService userService;
	public void say() {
		this.userService.say();
		System.out.println("userController.....say.....");
	}
}
