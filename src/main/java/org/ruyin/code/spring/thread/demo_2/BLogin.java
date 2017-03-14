package org.ruyin.code.spring.thread.demo_2;

public class BLogin extends Thread{

	@Override
	public void run() {
		super.run();
		LoginServlet.doPost("b", "bb");
	}
}
