package org.ruyin.code.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookSaleProxy implements InvocationHandler{

	private Object obj;
	
	public Object bindObj(Object target){
		this.obj = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("begin...");
		result = method.invoke(obj, args);
		System.out.println("end...");
		return result;
	}

}
