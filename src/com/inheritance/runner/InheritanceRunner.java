package com.inheritance.runner;
import com.inheritance.task.Car;
import com.inheritance.task.Scross;
import com.inheritance.task.XUV;
import com.inheritance.task.Swift;
import com.inheritance.task.BirdAbstract;
import com.inheritance.task.ParrotMod;
import com.inheritance.task.Duck;
import com.inheritance.task.Bird;
import com.utility.Utility;
public class InheritanceRunner{
	public static void main(String args[]){
		InheritanceRunner runnerObj = new InheritanceRunner();
		boolean bool = true;
		int choice;
		while(bool){
			System.out.println("Enter task ");
			choice = Utility.getIntInput();
			
			switch (choice ){
				case 2 :
						runnerObj.runCaseTwo();
						break;
				case 3 :
						runnerObj.runCaseThree();
						break;
				case 4 : 
						runnerObj.runCaseFour();
						break;
				case 5 :
						runnerObj.runCaseFive();
						break;
				case 6 :
						runnerObj.runCaseSix();
						break;
				case 7 :
						runnerObj.runCaseSeven();
						break;
				case 8 :
						runnerObj.runCaseEight();
						break;
				case 9 :
						runnerObj.runCaseNine();
						break;
				case 10 :
						runnerObj.runcaseTen();
						break;
				case 11 :
						bool = false;
						break;
				default :
						System.out.println("Enter a valid choice ");
						break;
		}		
	}	
}
	public void runCaseTwo(){
		int seats,airbags;
		String model,color;
		Swift swiftObjOne = new Swift();
		System.out.print("Enter number of seats ");
		seats = Utility.getIntInput();
		System.out.print("Enter number of airbags ");
		airbags = Utility.getIntInput();
		System.out.print("Enter model ");
		model = Utility.getStrInput();
		System.out.print("Enter color ");
		color = Utility.getStrInput();
		swiftObjOne.setSeats(seats);
		swiftObjOne.setAirbags(airbags);
		swiftObjOne.setModel(model);
		swiftObjOne.setColor(color);
		System.out.println("Number of seats   -"+swiftObjOne.getSeats());
		System.out.println("Number of airbags -"+swiftObjOne.getAirbags());
		System.out.println("Car Model         -"+swiftObjOne.getModel());
		System.out.println("Car color         -"+swiftObjOne.getColor());
	}
	public void runCaseThree(){
		int seats,airbags,yearOfMake;
		String model,color,engineNumber,type;
		System.out.print("Enter number of seats ");
		seats = Utility.getIntInput();
		System.out.print("Enter number of airbags ");
		airbags = Utility.getIntInput();
		System.out.print("Enter yeear Of Make ");
		yearOfMake = Utility.getIntInput();
		System.out.print("Enter model ");
		model = Utility.getStrInput();
		System.out.print("Enter color ");
		color = Utility.getStrInput();
		System.out.print("Enter Engine Number ");
		engineNumber = Utility.getStrInput();
		System.out.print("Enter Type of car ");
		type = Utility.getStrInput();
		Scross ScrossObjOne =  new Scross();
		ScrossObjOne.setSeats(seats);
		ScrossObjOne.setAirbags(airbags);
		ScrossObjOne.setYearOfMake(yearOfMake);
		ScrossObjOne.setModel(model);
		ScrossObjOne.setColor(color);
		ScrossObjOne.setEngineNumber(engineNumber);
		ScrossObjOne.setType(type);
		System.out.println("yearOfMake        -"+ScrossObjOne.getYearOfMake());
		System.out.println("Number of seats   -"+ScrossObjOne.getSeats());
		System.out.println("Number of airbags -"+ScrossObjOne.getAirbags());
		System.out.println("Car Engine Numb   -"+ScrossObjOne.getEngineNumber());
		System.out.println("Car type          -"+ScrossObjOne.getType());
		System.out.println("Car Model         -"+ScrossObjOne.getModel());
		System.out.println("Car color         -"+ScrossObjOne.getColor());
		
	}
	public void runCaseFour(){
		Swift swiftObjOne = new Swift();
		XUV xuvObjOne  =  new XUV();
		Scross scrossObjOne =  new Scross();
		acceptCarObj(swiftObjOne);
		acceptCarObj(scrossObjOne);
		acceptCarObj(xuvObjOne);

	}
	public void acceptCarObj(Car obj){
			System.out.println("Accepts a Car Object");
			if ( obj instanceof Swift){
				System.out.println("The Car type is Hatch ");
			} 
			else if ( obj instanceof XUV){
				System.out.println("The Car type is SUV ");
			}
			else {
				
				System.out.println("The Car type is Sedan ");
			}				
	}
	public void runCaseFive(){
		Swift swiftObjOne = new Swift();
		XUV xuvObjOne  =  new XUV();
		Scross scrossObjOne =  new Scross();
		acceptCarObj(swiftObjOne);
		acceptCarObj(scrossObjOne);
		acceptCarObj(xuvObjOne);		
	}
	public void runCaseSix(){
		
		Swift swiftObjOne = new Swift();
		acceptSwiftObj(swiftObjOne);		
		/*Car swiftObjTwo = new Swift();
		acceptSwiftObj(swiftObjTwo);		
		XUV xuvObjOne  =  new XUV();
		Scross scrossObjOne =  new Scross();
		acceptSwiftObj(xuvObjOne);
		acceptSwiftObj(scrossObjOne);*/
			
	}
	public void acceptSwiftObj(Swift obj){			
		System.out.println("Accepts Swift Object ");
	}
	public void runCaseSeven(){
			Scross scrossObjOne =  new Scross();
			scrossObjOne.maintanence();			
			Car scrossObjTwo =  new Scross();
			scrossObjTwo.maintanence();			
			Car carObjOne =  new Car();
			carObjOne.maintanence();
			Swift swiftObjOne =  new Swift();
			swiftObjOne.maintanence();		
	}
	public void runCaseEight(){
		XUV xuvObjOne =  new XUV();
		//XUV xuvObjTwo = new XUV("Overloaded constructor call ");
		
	}
	public void runCaseNine(){
		//BirdAbstract birdAbstractObj = new BirdAbstract();
		ParrotMod parrotModObj = new ParrotMod();
		parrotModObj.fly();
		parrotModObj.speak();
	}
	public void runcaseTen(){
		Duck duckObj = new Duck();
		duckObj.fly();
		duckObj.speak();		
	}	
}