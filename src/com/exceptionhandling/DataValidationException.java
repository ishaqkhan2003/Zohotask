package com.exceptionhandling;
import java.io.IOException;

public class DataValidationException extends Exception{
	public DataValidationException( String message ){
		super(message);
	}
	public DataValidationException( ){
		super();
	}
	public DataValidationException(String message,Throwable cause ){
		super(message,cause);
	}
}