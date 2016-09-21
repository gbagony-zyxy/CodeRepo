package org.ruyin.code.spring.aop;

import java.util.List;

public class Cooking {
	
	private List<String> dish;

	public List<String> getDish() {
		return dish;
	}

	public void setDish(List<String> dish) {
		this.dish = dish;
	}
	
	public void cook(){
		System.out.println("dish");
	}
}
