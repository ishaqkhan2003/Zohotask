package com.threads.runner;
import java.util.List;
import com.arraylist.task.ArrayListTask;
import com.exceptionhandling.DataValidationException;
import com.threads.task.ExtendedThread;
import com.threads.task.RunnableThread;
import com.utility.Utility;

public class ThreadRunner {
	ArrayListTask arrayListObj = new ArrayListTask();
	public static void main(String[] args) {
		ThreadRunner runnerObj = new ThreadRunner();
		boolean bool = true;
		int choice ;
		while(bool) {
			System.out.println("Enter choice ");
			choice = Utility.getIntInput();
			try {
				switch (choice) {
				case 1:
					runnerObj.operationOne();
					break;
				case 2:
					runnerObj.operationTwo();
					break;
				case 3:
					runnerObj.operationThree();
					break;
				
				case 4:
					runnerObj.operationFour();
					break;
					
				case 5:
					runnerObj.operationFive();
					break;
					
				default:
					break;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			}
		
		
	}
	public void operationOne() {
		ExtendedThread threadOne = new ExtendedThread();
		ExtendedThread threadTwo = new ExtendedThread();
		printData();
		threadTwo.start();
		threadOne.start();
		printData();
	}
	
	
	public void operationTwo() {
		RunnableThread target = new RunnableThread();
		printData();
		Thread threadOne = new Thread(target);
		threadOne.start();
		printData();
	}
	
	public void operationThree() throws Exception {
		printData();
		System.out.println("Enter thread name for extended thread ");
		String extendedThreadName = Utility.getStrInput();
		System.out.println("Enter thread name for runnable  thread ");
		String runnableThreadName = Utility.getStrInput();
		RunnableThread target = new RunnableThread();		
		Thread threadOne = new Thread(target,runnableThreadName);
		ExtendedThread threadTwo = new ExtendedThread(extendedThreadName);
		threadTwo.start();
		threadOne.start();
		printData();		
		
	}
	
	public void operationFour() throws Exception {
		System.out.println("Enter number of threads  ");
		int noOfThreads = Utility.getIntInput();
		System.out.println("Enter thread name for extended thread ");
		String name = Utility.getStrInput();
		System.out.println("Enter thread name for runnable thread ");
		String runnableName = Utility.getStrInput();
		List<Thread> threadListOne = createThread(noOfThreads,name);		
		List<Thread> threadTwo = getRunnableAndThread(noOfThreads, runnableName);
		//startAllThread(threadListOne);
		//startAllThread(threadTwo);
		printData();
	}
	
	public void operationFive() throws Exception {
		System.out.println("Enter number of threads  ");
		int noOfThreads = Utility.getIntInput();
		System.out.println("Enter thread name for extended thread ");
		String name = Utility.getStrInput();
		System.out.println("Enter thread name for runnable thread ");
		String runnableName = Utility.getStrInput();
		long time;
		List<ExtendedThread> threadListOne = arrayListObj.getArrayList("java.util.ArrayList");
		for (int i = 0;i<noOfThreads;i++) {
			System.out.println("Enter sleep time for thread "+i);
			time = Utility.getLongInput();
			ExtendedThread thread  = new ExtendedThread(name+i,time);
			arrayListObj.addToList(threadListOne, thread);
		}
		//List<Thread> threadTwo = getRunnableAndThread(noOfThreads, runnableName);
		startAllThread(threadListOne);
		//startAllThread(threadTwo);
		for (ExtendedThread thread : threadListOne){
			//thread.setFlag(false);
		}
		
	}
	
	public void  printData() {
		System.out.println("Current Thread name is         "+Thread.currentThread().getName());
		System.out.println("Current thread priority is     "+Thread.currentThread().getPriority());
		System.out.println("The current thread  state is   "+Thread.currentThread().getState());
	} 
	
	public  List<Thread> createThread(int noOfThreads,String name) throws Exception{
		Utility.checkNull(noOfThreads);
		Utility.checkNull(name);
		long time ;
		List<Thread> threadList = arrayListObj.getArrayList("java.util.ArrayList");
		for(int i=0;i<noOfThreads;i++) {
			System.out.println("Enter sleep time for thread "+i);
			time = Utility.getLongInput();
			ExtendedThread thread  = new ExtendedThread(name+i,time);
			arrayListObj.addToList(threadList, thread);
		}
		return threadList;
	}
	
	public List<Thread> getRunnableAndThread(int noOfThreads,String name) throws Exception{
		Utility.checkNull(name);
		Utility.checkNull(noOfThreads);
		List<Thread> threadList = arrayListObj.getArrayList("java.util.ArrayList");
		long time;
		for(int i=0;i<noOfThreads;i++) {
			System.out.println("Enter sleep time for thread "+i);
			time = Utility.getLongInput();
			RunnableThread target = new RunnableThread(time);
			Thread thread  = new Thread(target,name+i);
			arrayListObj.addToList(threadList, thread);
		}
		return threadList;
		
	}
	
	public   void startAllThread(List<ExtendedThread> threadList) throws DataValidationException{
		Utility.checkNull(threadList);
		for(Thread thread : threadList ) {
			thread.start();
		}
	}
}
