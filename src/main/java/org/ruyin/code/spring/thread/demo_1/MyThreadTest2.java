package org.ruyin.code.spring.thread.demo_1;

import org.junit.Test;

public class MyThreadTest2 {

	@Test
	public void testSync(){
		MyThread2 thread = new MyThread2();
		Thread t1 = new Thread(thread, "t1");
		Thread t2 = new Thread(thread, "t2");
		Thread t3 = new Thread(thread, "t3");
		Thread t4 = new Thread(thread, "t4");
		Thread t5 = new Thread(thread, "t5");
		Thread t6 = new Thread(thread, "t6");
		Thread t7 = new Thread(thread, "t7");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
	}
	
	@Test
	public void testSyncc(){
		MyThread2c thread = new MyThread2c();
		Thread t1 = new Thread(thread, "t1");
		Thread t2 = new Thread(thread, "t2");
		Thread t3 = new Thread(thread, "t3");
		Thread t4 = new Thread(thread, "t4");
		Thread t5 = new Thread(thread, "t5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
