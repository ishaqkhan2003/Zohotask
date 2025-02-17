package com.threads.task;

public class RunnableThread implements Runnable {
	
	private long sleepTime;
	
	public RunnableThread(long time) {
		this.sleepTime = time;
	}
	
	public RunnableThread() {
		
	}
	
	
	private boolean flag= true;
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(flag) {
			System.out.println("Tjread name is             "+Thread.currentThread().getName());
			System.out.println("Thread priority is         "+Thread.currentThread().getPriority());
			System.out.println("The current state is       "+Thread.currentThread().getState());
			System.out.println("Going to sleep             "+Thread.currentThread().getName());
			Thread.sleep(sleepTime);
			System.out.println("After  sleep               "+Thread.currentThread().getName());
			flag = false;
			}
		}
		catch(InterruptedException e) {
			System.out.println("INterrupted Exception ");
		}
	}
		

}
