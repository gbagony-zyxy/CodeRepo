package org.ruyin.code.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AdviceOfCook {

	@Pointcut("execution(* *.cook(..))")
	public void testCook(){
	}
	
	@Before(value = "testCook()")
	public void beforeTest(){
		System.out.println("BeforeCook");
	}
	
	@After(value="testCook()")
	public void afterTest(){
		System.out.println("AfterCook");
	}
	
	@Around("testCook()")
	public Object aroundTest(ProceedingJoinPoint p){
		System.out.println("before");
		Object o = null;
		try {
			o= p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("after");
		return o;
	}
}
