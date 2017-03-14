package org.ruyin.code.spring.thread.demo_2;

public class LoginTest {

	public static void main(String[] args) {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}
}
