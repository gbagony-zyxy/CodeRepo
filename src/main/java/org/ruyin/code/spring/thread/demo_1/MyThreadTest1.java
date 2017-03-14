package org.ruyin.code.spring.thread.demo_1;

import org.junit.Test;

public class MyThreadTest1 {

	@Test
	public void testShare(){
		MyThread1 myThread = new MyThread1("mm");
		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread);
		Thread t3 = new Thread(myThread);
		Thread t4 = new Thread(myThread);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	
	@Test
	public void testNoneshare(){
		MyThread1 a = new MyThread1("A");
		MyThread1 b = new MyThread1("B");
		MyThread1 c = new MyThread1("C");
		a.start();
		b.start();
		c.start();
	}
}
