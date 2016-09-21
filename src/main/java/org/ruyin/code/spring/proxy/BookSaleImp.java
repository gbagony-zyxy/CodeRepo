package org.ruyin.code.spring.proxy;

public class BookSaleImp implements BookSale{

	@Override
	public void salebook() {
		System.out.println("出售图书!!");
	}

}
