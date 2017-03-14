package org.ruyin.code.spring.thread.demo_3;

import org.junit.Test;
import org.ruyin.code.spring.thread.demo_4.MyThread1;
import org.ruyin.code.spring.thread.demo_4.MyThread2;
import org.ruyin.code.spring.thread.demo_4.MyThread3;

public class MyThreadTest {

	@Test
	public void test() {
		MyThread thread = new MyThread();
		// thread.start();
		thread.run();
	}

	@Test
	public void testCountOprator() {
		CountOperate operate = new CountOperate();
		Thread thread = new Thread(operate);
		thread.setName("VV");
		thread.start();
	}

	@Test
	public void testCountAlive() {
		ThreadAlive alive = new ThreadAlive();
		Thread thread = new Thread(alive);
		thread.setName("KK");
		thread.start();
	}

	@SuppressWarnings("static-access")
	@Test
	public void testInterrupt() {
		try {
			ThreadStop stop = new ThreadStop();
			stop.start();
			stop.sleep(2000);
			stop.interrupt();
		} catch (Exception e) {
		}
	}

	/**
	 * 测试对应类线程是否终止
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testInterrupted() {
		try {
			ThreadStop stop = new ThreadStop();
			stop.start();
			stop.sleep(1000);
			stop.interrupt();
			System.out.println("stop 1?" + stop.interrupted());
			System.out.println("stop 2?" + stop.interrupted());
		} catch (Exception e) {
		}
	}

	/**
	 * 测试当前线程是否终止
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testIsInterrupted() throws InterruptedException {
		ThreadStop stop = new ThreadStop();
		stop.start();
		stop.sleep(2000);
		// Thread.currentThread().interrupt();
		stop.interrupt();
		// System.out.println(stop.interrupted());
		System.out.println("stop 1?" + stop.isInterrupted());
		System.out.println("stop 2?" + stop.isInterrupted());
	}

	/**
	 *  在沉睡中停止 
	 */
	@Test
	public void testSleepStop() throws InterruptedException {
		try {
			MyThread1 thread1 = new MyThread1();
			thread1.start();
			thread1.sleep(200);
			thread1.interrupt();
		} catch (Exception e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end..");
	}
	
	@Test
	public void testStop() throws InterruptedException {
		try {
			MyThread2 thread = new MyThread2();
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		} catch (Exception e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end..");
	}
	
	@Test
	public void testStop1() throws InterruptedException {
		MyThread3 thread = new MyThread3();
		thread.start();
	}
}
