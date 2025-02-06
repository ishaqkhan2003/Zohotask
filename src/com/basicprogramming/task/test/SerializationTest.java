package com.basicprogramming.task.test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest  {
	public static void main(String args[]) {
		try {
			SerializationTest testObj = new SerializationTest();
		Car carObj = Car.getInstance();
		carObj.setEngineNumber("TGD897J");
		carObj.setType("Sedan");
		carObj.setYearOfMake(2020);
		
		testObj.serializeObj(carObj, "carTwo");
		Car carObjTwo = (Car) testObj.deSerializeObj("car");
		System.out.println("ENgine Number"+carObjTwo.getEngineNumber());
		System.out.println("Type"+carObjTwo.getType());
		System.out.println("Year Of Make"+carObjTwo.getYearOfMake());
		Car carObjThree = (Car) carObj.clone();
		if(carObj == carObjTwo || carObj == carObjThree) {
			System.out.println("Singleton design pattern not violated ");
			
		}
		else {
			System.out.println("Singleton design pattern violated ");
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void serializeObj(Object obj,String fileName) {
		try(FileOutputStream fileStream = new FileOutputStream(fileName);
				ObjectOutputStream objectStream = new ObjectOutputStream(fileStream)){
			objectStream.writeObject(obj);
			System.out.println("Object Serialized ");
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	public Object deSerializeObj(String fileName) throws Exception {
		
		try(FileInputStream fileInputStream =  new FileInputStream(fileName);
			ObjectInputStream objectInputStream =  new ObjectInputStream(fileInputStream)){
			Object object = objectInputStream.readObject();
			return object;
		}
		catch (Exception e) {
			throw e;
		}

	}
}
