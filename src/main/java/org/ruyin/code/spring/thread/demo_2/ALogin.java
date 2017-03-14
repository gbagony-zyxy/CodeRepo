package org.ruyin.code.spring.thread.demo_2;

public class ALogin extends Thread{

	@Override
	public void run() {
		super.run();
		LoginServlet.doPost("a", "aa");
	}
}
