package org.ruyin.code.spring.thread.demo_4;

/**
 *  在sleep()方法中停止 
 */
public class MyThread1 extends Thread{

	@Override
	public void run() {
		try {
			System.out.println("thread begin...");
			this.sleep(200000);
			System.out.println("thread end...");
		} catch (Exception e) {
			System.out.println("into exception..."+ this.isInterrupted());
			e.printStackTrace();
		}
	}
}
