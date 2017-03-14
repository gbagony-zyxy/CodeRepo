package org.ruyin.code.spring.thread.demo_1;

/**
 *  测试共享访问和非共享访问
 */
public class MyThread1 extends Thread{

	private int count =5;
	
	public MyThread1(String name) {
		super();
		this.setName(name);
	}
	
	@Override
	public void run() {
		super.run();
		while(count > 0){
			count --;
			System.out.println("calcu by "+currentThread().getName()+",count="+count);
		}
	}
}
