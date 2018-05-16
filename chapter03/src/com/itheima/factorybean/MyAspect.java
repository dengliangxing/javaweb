package com.itheima.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		check_Permissoins();
		Object obj = mi.proceed();
		log();
		return obj;
	}
	public void check_Permissoins() {
		System.out.println("ģ����Ȩ�ޡ�����������");
	}
	public void log() {
		System.out.println("ģ���¼��־������������");
	}
}
