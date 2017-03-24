package org.ruyin.code.spring.redis.controller;

import org.ruyin.code.spring.redis.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
@RequestMapping("/member")
public class MemberController {
 
	@Autowired
	@Qualifier("memberService")
	private MemberService memberService;
	
}
