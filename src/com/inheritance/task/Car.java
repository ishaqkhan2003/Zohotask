package com.inheritance.task;
public class Car{
	private int yearOfMake;
	private String engineNumber,type;
	public Car(){
	}
	public Car(String string){
			System.out.println(string);
	}
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

}