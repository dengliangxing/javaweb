package com.itheima.instance.sssemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {

	public static void main(String[] args) {
		String xmlpath = "com/itheima/instance/sssemble/beans5.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlpath);
		System.out.println(applicationContext.getBean("user1"));
		System.out.println(applicationContext.getBean("user2"));

	}

}
