package org.ruyin.code.spring.thread.demo_4;

public class MyThread2 extends Thread{
	private int  i =0;
	
	@Override
	public void run() {
		try {
			while(true){
				i ++;
				System.out.println("i = "+ i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
