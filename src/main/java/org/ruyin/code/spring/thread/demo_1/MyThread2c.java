package org.ruyin.code.spring.thread.demo_1;

public class MyThread2c extends Thread{

	private int count = 5;
	
	/**
	 *  System.out.println()与count--联合使用时可能出现的线程安全问题
	 */
	@Override
	public void run() {
		super.run();
		System.out.println("i="+(count--)+",Thread="+Thread.currentThread().getName());
	}
}
