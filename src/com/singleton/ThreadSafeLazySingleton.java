package com.singleton;

public class ThreadSafeLazySingleton {
	private ThreadSafeLazySingleton() {}
	private static ThreadSafeLazySingleton instance;
	public static synchronized ThreadSafeLazySingleton getInstanceOfThreadSafe() {
		if(instance == null) {
			instance = new ThreadSafeLazySingleton();
		}
		return instance;
	}
}
