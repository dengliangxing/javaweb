package com.itheima.instance.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssembleTest {
	public static void main(String[] args) {
		String xmlpath = "com/itheima/instance/annotation/beans6.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlpath);
		UserController userc = (UserController)applicationContext.getBean("userController");
		userc.say();
	}
}
