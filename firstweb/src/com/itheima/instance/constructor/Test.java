package com.itheima.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		String XmlPath="com/itheima/instance/constructor/beans1.xml";
		ApplicationContext applicationcon = new ClassPathXmlApplicationContext(XmlPath);
		Bean1 bean =(Bean1)applicationcon.getBean("bean1");
		System.out.println(bean);
	}

}
