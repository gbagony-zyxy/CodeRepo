package org.ruyin.code.spring.thread.demo_4;

/**
 *  使用异常强制线程的终止
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("Thread has been stopped");
					throw new Exception("intercpe...");
				}
				System.out.println("i =" + (i + 1));
			}
			System.out.println("Still execute...");
		} catch (Exception e) {
			System.out.println("Into the catch method...");
			e.printStackTrace();
		}
	}
}
