package org.ruyin.code.spring;

import java.lang.reflect.Method;

public class MethodReplacer implements org.springframework.beans.factory.support.MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Repalced origin method.");
		return null;
	}

}
