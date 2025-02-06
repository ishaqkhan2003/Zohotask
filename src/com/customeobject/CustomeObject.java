package com.customeobject;
public class CustomeObject{
	public CustomeObject(String name){
		this.name =  name;
	}
	
	private String name;
	@Override
	public String toString(){
		return name;
	}
}