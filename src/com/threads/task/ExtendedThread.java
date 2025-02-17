package com.threads.task;

public class ExtendedThread  extends Thread{
	
	public ExtendedThread() {
		super();
	}
	
	public ExtendedThread(Runnable target,String name) {
		super(target,name);
	}
	
	public ExtendedThread(String name) {
		super(name);
	}
	
	public ExtendedThread(Runnable target) {
		super(target);
	}
	
	public ExtendedThread(String name,long time) {
		super(name);
		this.sleepTime = time;
	}
	
	private long sleepTime;
	private boolean flag= true;
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		try {
			while(flag) {
				System.out.println("Prioroty is          "+getPriority());
				System.out.println("Thread name is       "+getName());
				System.out.println("The current state is "+getState());
				System.out.println("Going to sleep       "+getName());
				Thread.sleep(sleepTime);
				System.out.println("After sleep          "+getName());
			}
		}
		catch(InterruptedException e) {
			System.out.println("InterruptedException ");
		}
	}

}
