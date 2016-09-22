package org.ruyin.code.spring;

import org.ruyin.code.spring.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestControllerTest {

	@RequestMapping("/world")
	public User display(){
		return new User("ruyin", "ruyin@qq.com");
	}
}
