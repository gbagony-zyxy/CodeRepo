package org.ruyin.code.spring.thread.demo_3;

/**
 *  测试类的初始化以及方法调用在被线程启动方面的区别
 */
public class MyThread extends Thread{

	public MyThread() {
		System.out.println("Constructor call thread = "+ Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("Run method call thread = "+ Thread.currentThread().getName());
	}
	
}
