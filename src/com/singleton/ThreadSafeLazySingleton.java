package com.singleton;

import java.io.Serializable;

import com.exceptionhandling.DataValidationException;

public class ThreadSafeLazySingleton implements Serializable{
	private ThreadSafeLazySingleton()throws DataValidationException {
		if(instance!=null) {
			throw new DataValidationException("Instance already created ");
		}
	}
	
	private static volatile ThreadSafeLazySingleton instance;
	public static synchronized ThreadSafeLazySingleton getInstanceOfThreadSafe() throws DataValidationException{
		if(instance == null) {
			instance = new ThreadSafeLazySingleton();
		}
		return instance;
	}
	protected Object readResolve() throws DataValidationException {
		return getInstanceOfThreadSafe();
	}
}
