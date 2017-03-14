package org.ruyin.code.spring.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBean {

	//可以取多个别名
	@Bean(name={"aa","bb","cc"})
	private Student getsStudent(){
		return new Student();
	}
	
	public static class BeanA{
		
		public String getStr(){
			return "abc";
		}
	}
	
	public static void main(String[] args) {

	}
}
