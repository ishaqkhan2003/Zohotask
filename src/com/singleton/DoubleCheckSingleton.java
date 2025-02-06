package com.singleton;

import java.io.Serializable;

import com.exceptionhandling.DataValidationException;

public class DoubleCheckSingleton implements Serializable{
	private  DoubleCheckSingleton() throws DataValidationException {
		if(instance!=null) {
			throw new DataValidationException("Instance already created ");
		}
	}
	private static volatile DoubleCheckSingleton instance;
	public static DoubleCheckSingleton getInstanceOfDoubleCheck()throws DataValidationException  {
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
