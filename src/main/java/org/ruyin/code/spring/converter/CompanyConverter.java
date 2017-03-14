package org.ruyin.code.spring.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *  自定义转换 
 */
@Component
public class CompanyConverter implements Converter<String, Company>{

	@Override
	public Company convert(String str) {
		Company company = null;
		if(str != null){
			company = new Company();
			company.setName(str);
		}
		return company;
	}

}
