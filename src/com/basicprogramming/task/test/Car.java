package com.basicprogramming.task.test;

import java.io.Serializable;

public class Car implements Serializable,Cloneable{
	private static final long serialVersionUID = 108;
	private int yearOfMake;
	private String engineNumber,type;
	public static final Car instance =  new Car();
	private Car(){
	}
	public static Car getInstance() {
		return instance;
	}
	/*public Car(String string){
			System.out.println(string);
	}*/
	public void setYearOfMake(int yearOfMake){
		this.yearOfMake = yearOfMake;
	}
	public int getYearOfMake(){
		return yearOfMake;
	}
	public void setEngineNumber(String engineNumber){
		this.engineNumber = engineNumber;
	}
	public String getEngineNumber(){
		return engineNumber;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
	public void maintanence(){		
		System.out.println("The Car is under maintanence ");
	}
	public Object clone() {
		throw new RuntimeException("cloning not supported");
	}
	/*protected Object readResolve() {
		return instance;
	}*/

}