package org.ruyin.code.spring.thread.demo_1;

/**
 *  测试线程的随机性
 */
public class MyThread extends Thread{

	@Override
	public void run() {
		super.run();
		try {
			for(int i = 0; i < 10;i++){
				int time = (int)(Math.random()*1000);
				Thread.sleep(time);
				System.out.println("run-->"+Thread.currentThread().getName());
			}
		} catch (Exception e) {
			
		}
	}
}
