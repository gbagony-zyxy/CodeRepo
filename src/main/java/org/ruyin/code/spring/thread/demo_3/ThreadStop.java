package org.ruyin.code.spring.thread.demo_3;

public class ThreadStop extends Thread{

	@Override
	public void run() {
		for(int i =0 ;i < 500000 ;i++){
			if(this.isInterrupted()){
				System.out.println("Thread has been stopped");
				break;
			}
			System.out.println("i="+(i+1));
		}
	}
}
