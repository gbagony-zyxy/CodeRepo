package org.ruyin.code.spring;

import java.util.List;

import org.junit.Test;
import org.ruyin.code.spring.aop.Cooking;
import org.ruyin.code.spring.bean.Student;
import org.ruyin.code.spring.bean.User;
import org.ruyin.code.spring.proxy.Book;
import org.ruyin.code.spring.proxy.BookFacade;
import org.ruyin.code.spring.proxy.BookFacadeProxy;
import org.ruyin.code.spring.proxy.BookSale;
import org.ruyin.code.spring.proxy.BookSaleImp;
import org.ruyin.code.spring.proxy.BookSaleProxy;
import org.ruyin.code.spring.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReplaceMethod {

	@Test
	public void testReplace(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MetaReplaced replaced = (MetaReplaced) context.getBean("origin");
		replaced.changeMe();
	}
	
	@Test
	public void testUser(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User) context.getBean("testBean");
		System.out.println(user.getUsername()+";"+user.getEmail());
	}
	
	@SuppressWarnings("resource")
	@Test
	public void testAop(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Cooking cooking = (Cooking) context.getBean("cooking");
		cooking.cook();
	}
	
	@Test
	public void testJDKProxy(){
		BookSaleProxy proxy = new BookSaleProxy();
		BookSale bookSale = (BookSale) proxy.bindObj(new BookSaleImp());
		bookSale.salebook();
	}
	
	@Test
	public void testCglibProxy(){
		BookFacadeProxy proxy = new BookFacadeProxy();
		Book facade = (Book) proxy.getInstance(BookFacade.class);
		facade.printBook();
	}
	
	@SuppressWarnings("resource")
	@Test
	public void testDb() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		StudentService service = (StudentService) context.getBean("studentService");
		Student student = new Student();
		student.setUsername("ruyin");
		student.setAge(23);
		student.setEmail("vaq@126.com");
		
		service.save(student);
		
		/*List<Student> students = service.getStudent();
		System.out.println(students.size());*/
	}
}
