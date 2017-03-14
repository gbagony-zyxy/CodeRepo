package org.ruyin.code.spring.converter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CompanyController {

	@RequestMapping("/convert")
	public String add(@RequestParam("company") Company company){
		System.out.println(company);
		return "convert";
	}
}
