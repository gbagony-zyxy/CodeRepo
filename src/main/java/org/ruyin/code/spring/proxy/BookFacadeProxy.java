package org.ruyin.code.spring.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class BookFacadeProxy implements MethodInterceptor{

	private Enhancer enhancer = new Enhancer();
	
	public Object getInstance(Class<?> clazz){
		/*enhancer.setSuperclass(clazz.getSuperclass());
		enhancer.setCallback(this);
		return enhancer.create();*/
		return Enhancer.create(clazz.getSuperclass(),clazz.getInterfaces(),this);
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("...b...");
		Object result = proxy.invokeSuper(obj, args);
		System.out.println("...a...");
		return result;
	}

	
}
