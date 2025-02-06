package com.inheritance.task;
public class Swift extends Car{
	private int seats,airbags;
	private String model,color;
	public void setSeats(int seats){
		this.seats = seats;
	}
	public int getSeats(){
		return seats;
	}
	public void setAirbags(int airbags){
		this.airbags = airbags;
	}
	public int getAirbags(){
		return airbags;
	}
	public void setModel(String model){
		this.model= model;
	}
	public String getModel(){
		return model;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
}