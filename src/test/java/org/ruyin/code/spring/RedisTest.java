package org.ruyin.code.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruyin.code.spring.redis.bean.Member;
import org.ruyin.code.spring.redis.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml"})
public class RedisTest {

	@SuppressWarnings("unused")
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private RedisTemplate<String, String> template;
	@Autowired
	private JedisConnectionFactory factory;
	
	@Test
	public void redisTest(){
		Member member = new Member();
		member.setId("1224");
		member.setNickname("ruyin");
		
		//memberService.add(member);
	}
	
	@Test
	public void redisTest1(){
		template.delete("age");
	}
	
	@Test
	public void redisTest2() {
		System.out.println(factory.getConnection().decr("age".getBytes()));;
		System.out.println(factory.getPassword());
		System.out.println(factory.getHostName());
	}
}
