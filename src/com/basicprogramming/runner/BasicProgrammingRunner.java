package com.basicprogramming.runner;
import com.basicprogramming.task.BasicProgrammingTask;
import com.basicprogramming.Rainbow;
import com.exceptionhandling.DataValidationException;
import com.properties.task.PropertiesTask;
import com.utility.Utility;
import com.customeobject.CustomeObject;
import com.singleton.LazyInitializeSingleton;
import com.singleton.BillPughSingleton;
import com.singleton.DoubleCheckSingleton;
import com.singleton.StaticBlockSingleton;
import com.singleton.ThreadSafeLazySingleton;
import com.singleton.EagerInitializeSingleton;
import com.singleton.EnumSingleton;
//import com.customeobject.POJO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
//import java.io.FileNotFoundException
import java.io.BufferedWriter;
import java.util.Properties;
import com.time.task.TimeTask;
import java.time.LocalDateTime;

public class BasicProgrammingRunner {
	TimeTask timeObj = new TimeTask();
	BasicProgrammingTask taskObj = new BasicProgrammingTask();
	PropertiesTask propertyObj = new PropertiesTask();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicProgrammingRunner runnerObj = new BasicProgrammingRunner();
		boolean bool = true;
		int choice;
		while(bool) {
			try {
				System.out.print("Enter task number :");
				choice = Utility.getIntInput();
				switch(choice) {
					case 1:
						runnerObj.operationOne("");
						break;
					case 2:
						runnerObj.operationTwo("");
						break;
					case 3:
						runnerObj.operationThree("");
						break;
					case 4:
						runnerObj.operationFour();
						break;
					case 5:
						runnerObj.operationFive();
						break;
					case 6:
				//		runnerObj.operatonSix();
						break;
					case 7:
					//	runnerObj.operationSeven();
						break;
					case 8:
						runnerObj.operationEight();
						break;
					case 9:
						runnerObj.operationNine();
						break;
					case 10:
						runnerObj.operationTen();
						break;
					case 11:
						runnerObj.operationEleven();
						break;
				}
				
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			catch(DataValidationException e) {
				e.printStackTrace();
				}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			catch(NoSuchMethodException e) {
				e.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			}
		
	}
	public void operationOne(String filePath) throws DataValidationException,IOException{
	
		String fileName;
		System.out.print("Enter File name ");
		fileName = Utility.getStrInput();
		try(BufferedWriter bWriter = taskObj.getBufferedWriter(filePath+fileName)){
			System.out.println("Enter number of lines to enter ");
			int noOfLines = Utility.getIntInput(),i;
			String string;
			for(i=0;i<noOfLines;i++) {
				System.out.print("Enter line "+i+" -");
				string = Utility.getStrInput();
				taskObj.writeToBufferedWriter(bWriter, string);				
			}
		}
		catch(DataValidationException e) {
			throw new DataValidationException("Exception thrown by runner class",e);
		}
		catch(IOException e) {
			throw new IOException("IOexception thrown from runner", e);
		}
		
	}
	public void operationTwo(String filePath)throws DataValidationException,IOException{
		Properties myProperty = propertyObj.getProperties();
		System.out.print("Enter number of key and value to be stored ");
		int noOfPairs = Utility.getIntInput(),i;
		String key,value;
		for(i=0;i<noOfPairs;i++) {
			System.out.print("Enter key "+(i+1)+" -");
			key = Utility.getStrInput();
			System.out.print("Enter value "+(i+1)+" -");
			value = Utility.getStrInput();
			propertyObj.setToProperty(myProperty, key, value);
		}

		String fileName;
		System.out.print("Enter File name ");
		fileName = Utility.getStrInput();
			try(BufferedWriter bWriter = taskObj.getBufferedWriter(filePath+fileName)){
				System.out.println("Enter comments to add ");
				String comments = Utility.getStrInput();
				propertyObj.storeToFile( myProperty,bWriter, comments);
				System.out.println("Successfully added to the file ");
				
			}
			catch(IOException e) {
				throw new  IOException("Exception from runner class ", e);
			}
		
	}
	public void operationThree(String filePath) throws DataValidationException,IOException{
		// TODO Auto-generated method stub
	
		String  fileName;

		System.out.print("Enter file name ");
		fileName = Utility.getStrInput();	
			try(BufferedReader brTwo  = taskObj.getBufferedReader(filePath+fileName);){
				Properties myProperty = propertyObj.getProperties();	
				propertyObj.loadFile(myProperty, brTwo);
				for(String key : propertyObj.getStringPropertyName(myProperty)) {
					System.out.println("The key is "+key+" and its value is "+propertyObj.getValue(myProperty,key));
				}
				}
			catch (FileNotFoundException e) {
				throw new DataValidationException("Reader file not available ",e);
			}

	}
	public void operationFour()throws IOException,DataValidationException {
		
		String  filePath;
		System.out.print("Enter file name ");
		filePath = Utility.getStrInput();
		if(taskObj.checkIsDirectory(filePath, true)) {
			System.out.println("Running operation one ");
			operationOne(filePath+File.separator);
			System.out.println("Running operation two ");
			operationTwo(filePath+File.separator);
			System.out.println("Running operation three ");
			operationThree(filePath+File.separator);
		}
	}
	public void operationFive() {
		System.out.println("Enter string to append ");
		String string = Utility.getStrInput();
		CustomeObject customeObj = new CustomeObject(string);
		System.out.println("The object is "+customeObj);
	}
	/*public void operatonSix()throws DataValidationException {
		System.out.print("Enter a string ");
		String string = Utility.getStrInput();
		System.out.print("Enter a integer value ");
		int integer = Utility.getIntInput();
		POJO pojoObj =  new POJO(string,integer);
		System.out.println("Printing the created object "+pojoObj);
	}
	public void operationSeven() {
		System.out.print("Enter a string ");
		String string = Utility.getStrInput();
		System.out.print("Enter a integer value ");
		int integer = Utility.getIntInput();
		POJO pojoObj =  new POJO();
		pojoObj.setInteger(integer);
		pojoObj.setString(string);
		System.out.println("Printing the created object "+pojoObj);
	}*/
	public  void operationEight() throws ClassNotFoundException,NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<?> pojoObj = Class.forName("com.customeobject.POJO");
		Constructor<?> defaultConstructor = pojoObj.getConstructor();
		Object defaultConsObj = defaultConstructor.newInstance();
		System.out.println("The default constructor is "+defaultConsObj);
		System.out.println("Creating overloaded constructor ");
		System.out.print("Enter a string ");
		String string = Utility.getStrInput();
		System.out.print("Enter a integer value ");
		int integer = Utility.getIntInput();
		Constructor<?> overloadedCons = pojoObj.getConstructor(String.class,int.class);
		Object overloadedConsObj = overloadedCons.newInstance(string,integer);
		System.out.println("The overloaded constructor is "+overloadedConsObj);
		System.out.println("Calling getter and setter using reflection :");
		System.out.print("Enter a string to invoke setter ");
		String setterString = Utility.getStrInput();
		System.out.print("Enter a integer value to invoke setter ");
		int setterInt = Utility.getIntInput();
		Method setterMethodOne = pojoObj.getDeclaredMethod("setString", String.class);
		setterMethodOne.invoke(overloadedConsObj,setterString);
		Method setterMethodTwo = pojoObj.getDeclaredMethod("setInteger",int.class);
		setterMethodTwo.invoke(overloadedConsObj, setterInt);
		Method getterMethodOne = pojoObj.getMethod("getString");
		System.out.println(getterMethodOne.invoke(overloadedConsObj));
		Method getterMethodTwo = pojoObj.getMethod("getInteger");
		System.out.println(getterMethodTwo.invoke(overloadedConsObj));	
		
	}
	public void operationNine() {
		for(Rainbow rainbow:Rainbow.values()) {
			System.out.println("The color is "+rainbow+" the value is "+rainbow.getValue());
			System.out.println("The ordinal is "+rainbow.ordinal());
		}
	}
	public void operationTen() {
		LazyInitializeSingleton instanceOne  = LazyInitializeSingleton.getInstanceOfSingleton();
		System.out.println("Lazy Initia");
		EagerInitializeSingleton instanceTwo  = EagerInitializeSingleton.getInstanceOfEager();
		DoubleCheckSingleton instanceThree = DoubleCheckSingleton.getINstanceOfDoubleCheck();
		StaticBlockSingleton instanceFour = StaticBlockSingleton.getInstanceOfStaticBlock();
		BillPughSingleton instanceFive = BillPughSingleton.getInstaceOfBillPugh();
		ThreadSafeLazySingleton instanceSix = ThreadSafeLazySingleton.getInstanceOfThreadSafe();
		EnumSingleton instanceSeven = EnumSingleton.INSTANCE;
		System.out.println("Eager initialize Singleton         "+instanceTwo);
		System.out.println("Static Block initialize Singleton  "+instanceFour);
		System.out.println("Lazy initialize Singleton          "+instanceOne);
		System.out.println("Threadsafe initialize Singleton    "+instanceSix);
		System.out.println("Double Check initialize Singleton  " +instanceThree);
		System.out.println("BillPugh initialize Singleton      "+instanceFive);
		System.out.println("Enum initialize Singleton      "+instanceSeven);
	}
	
	public void operationEleven() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}

}
