package com.singleton;
import java.io.Serializable;

import com.exceptionhandling.DataValidationException;

public class LazyInitializeSingleton  implements Serializable{
	private LazyInitializeSingleton()throws DataValidationException {
		if(instance!=null) {
			throw new DataValidationException("Instance already created ");
		}
	}
	private static  LazyInitializeSingleton instance;
	public static final LazyInitializeSingleton getInstanceOfSingleton() throws DataValidationException{
		if(instance == null) {
			instance =  new LazyInitializeSingleton();
		}
		return instance;
		
	}
	protected Object readResolve() throws DataValidationException {
		return getInstanceOfSingleton();
	}
}
