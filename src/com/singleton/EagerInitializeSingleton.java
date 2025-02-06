package com.singleton;

import com.exceptionhandling.DataValidationException;

public class EagerInitializeSingleton {
	private EagerInitializeSingleton()  {
		if(instance!=null) {
			throw new RuntimeException();
		}
	}
	private static final EagerInitializeSingleton instance = new EagerInitializeSingleton();
	public static EagerInitializeSingleton getInstanceOfEager() {
		return instance;
	}

}
