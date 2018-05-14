package com.itheima.instance.constructor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String xmlPath = "com/itheima/instance/constructor/beans2.xml";
		ApplicationContext applicationcon = new ClassPathXmlApplicationContext(xmlPath);
		Bean2 bean=(Bean2)applicationcon.getBean("beans2");
		System.out.println(bean);

	}

}
