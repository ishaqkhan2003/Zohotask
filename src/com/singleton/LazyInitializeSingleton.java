package com.singleton;

public class LazyInitializeSingleton {
	private LazyInitializeSingleton() {}
	private static  LazyInitializeSingleton instance;
	public static final LazyInitializeSingleton getInstanceOfSingleton() {
		if(instance == null) {
			instance =  new LazyInitializeSingleton();
		}
		return instance;
		
	}
}
