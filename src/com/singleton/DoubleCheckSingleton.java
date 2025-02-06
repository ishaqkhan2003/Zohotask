package com.singleton;

public class DoubleCheckSingleton {
	private  DoubleCheckSingleton() {}
	private static volatile DoubleCheckSingleton instance;
	public static DoubleCheckSingleton getINstanceOfDoubleCheck() {
		if(instance == null) {
			synchronized(DoubleCheckSingleton.class) {
				if(instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
