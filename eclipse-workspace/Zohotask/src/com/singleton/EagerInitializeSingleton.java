package com.singleton;

public class EagerInitializeSingleton {
	private EagerInitializeSingleton() {}
	private static final EagerInitializeSingleton instance = new EagerInitializeSingleton();
	public static EagerInitializeSingleton getInstanceOfEager() {
		return instance;
	}

}
