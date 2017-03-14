package org.ruyin.code.spring.thread.demo_4;

public class MyThread3 extends Thread{

	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			e.printStackTrace();
		}
	}
}
