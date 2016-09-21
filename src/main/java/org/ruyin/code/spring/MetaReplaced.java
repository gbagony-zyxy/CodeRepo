package org.ruyin.code.spring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;

public class MetaReplaced {
	protected Map<String, String> method;
	protected String value;
	
	public MetaReplaced(@Qualifier(value="qf")Map<String, String> method) {
		this.method = method;
	}
	
	public MetaReplaced(Integer value) {
	}
	
	public MetaReplaced(Map<String, String> method,String value) {
		this.method = method;
		this.value = value;
	}
	
	public void changeMe(){
		System.out.println("changeMe");
	}
}
