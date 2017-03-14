package org.ruyin.code.spring.thread.demo_1;

public class MyThreadTest {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.setName("mythread");
			thread.start();
			for(int i = 0; i< 10 ;i++){
				int time = (int)(Math.random()*1000);
				Thread.sleep(time);
				System.out.println("main-->"+Thread.currentThread().getName());
			}
		} catch (Exception e) {
			
		}
	}
}
