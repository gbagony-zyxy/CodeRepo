package org.ruyin.code.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ruyin.code.spring.bean.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class UserController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<User> userList = new ArrayList<>();
		User userA = new User();
		User userB = new User();
		userA.setEmail("gbagony@126.com");
		userB.setEmail("ruyinvaq@gmail.com");
		userA.setUsername("gbagony");
		userB.setUsername("ruyin");
		userList.add(userA);
		userList.add(userB);
		//第一个参数表示视图组件的逻辑名称,视图解析器会使用该名称查找实际的View对象(到实际页面)
		//第二个参数传递给视图的模型对象名称(实际页面中的键)
		//第三个传递给视图的模型对象的值(实际页面中的值)
		return new ModelAndView("userList", "users", userList);
	}

}
