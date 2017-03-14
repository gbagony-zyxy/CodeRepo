package org.ruyin.code.spring.thread.demo_4;

import org.junit.Test;

public class TestThread {

	@Test
	public void testThread(){
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.sleep(2000);
			thread.interrupt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end...");
	}
}
