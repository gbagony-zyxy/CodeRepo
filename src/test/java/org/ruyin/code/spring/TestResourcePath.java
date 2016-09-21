package org.ruyin.code.spring;

import java.net.URISyntaxException;

import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.util.StringUtils;

public class TestResourcePath {

	public static void main(String[] args) throws URISyntaxException {
		boolean url = ResourcePatternUtils.isUrl("classpath:beans.xml");
		System.out.println(url);
		//URI urls= ResourceUtils.toURI("classpath:beans.xml");
		//System.out.println(urls);
		String str = StringUtils.replace("classpath:beans.xml", "", "%20");
		System.out.println(str);
	}
}
