package org.ruyin.code.spring.thread.demo_1;

/**
 * 测试线程安全访问
 * synchronized可以在对象和方法上加锁,加锁的区域被称为"临界区"或"互斥区"
 */
public class MyThread2 extends Thread {

	private int count = 7;

	@Override
	synchronized public void run() {
		super.run();
		count--;
		System.out.println("Calculate by " + currentThread().getName() + ",count = " + count);

	}
}
