package com.singleton;

import java.io.Serializable;

import com.exceptionhandling.DataValidationException;

public class StaticBlockSingleton implements Serializable{
	private StaticBlockSingleton() throws DataValidationException {
		if(instance!=null) {
			throw new DataValidationException("Instance already created ");
		}
	}
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
	protected Object readResolve() {
		return getInstanceOfStaticBlock();
	}
}
