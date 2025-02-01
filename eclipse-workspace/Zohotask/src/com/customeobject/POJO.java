package com.customeobject;

public class POJO {
	public POJO() {
		//DEFAULT CONSTRUCTOR
	}
	public POJO(String string,int integer) {
		//OVERLOADED CONSTRUCTOR
		this.string = string;
		this.integer = integer;
	}
	private String string;
	private int integer;
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public int getInteger() {
		return integer;
	}
	public void setInteger(int integer) {
		this.integer = integer;
	}
	@Override
	public String toString() {
		return "String is "+string+" the int is "+integer;
	}
	
}
