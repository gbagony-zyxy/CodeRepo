package org.ruyin.code.spring;

import java.beans.ConstructorProperties;

public class ExampleBean {

	private int year;
	private String ultimateAnswer;

	/**
	 *  当一个类中存在多个字段，但构造方法只取其中的几个之时，为唯一确定构造函数所需对应的参数，使用该注解，唯一标识对应字段的get方法 
	 */
	@ConstructorProperties({"year","ultimateAnswer"})
	public ExampleBean(int year, String ultimateAnswer) {
		this.year = year;
		this.ultimateAnswer = ultimateAnswer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getUltimateAnswer() {
		return ultimateAnswer;
	}

	public void setUltimateAnswer(String ultimateAnswer) {
		this.ultimateAnswer = ultimateAnswer;
	}

}
