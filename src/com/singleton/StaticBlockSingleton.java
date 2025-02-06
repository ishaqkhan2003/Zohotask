package com.singleton;

public class StaticBlockSingleton {
	private StaticBlockSingleton() {}
	private static StaticBlockSingleton instance;
	static {
		try {
			instance = new StaticBlockSingleton();
		}
		catch(Exception e) {
			throw new RuntimeException("Exception in creatic static instance ");
		}
	}
	public  static StaticBlockSingleton getInstanceOfStaticBlock() {
		return instance;
	}
}
