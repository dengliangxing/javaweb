package com.itheima.instance.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {
		String xmlpath = "com/itheima/instance/scope/beans4.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlpath);
		System.out.println(applicationContext.getBean("bean4"));
		System.out.println(applicationContext.getBean("bean4"));

	}

}
