package com.basicprogramming.runner;
import com.basicprogramming.task.BasicProgrammingTask;
import com.basicprogramming.Rainbow;
import com.exceptionhandling.DataValidationException;
import com.utility.Utility;
import com.customeobject.CustomeObject;
import com.singleton.LazyInitializeSingleton;
import com.singleton.BillPughSingleton;
import com.singleton.DoubleCheckSingleton;
import com.singleton.StaticBlockSingleton;
import com.singleton.ThreadSafeLazySingleton;
import com.singleton.EagerInitializeSingleton;
import com.singleton.EnumSingleton;
import com.customeobject.Test;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.time.ZoneId;
import java.time.DayOfWeek;
import java.time.Month;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.time.task.TimeTask;

public class BasicProgrammingRunner {
	private static final Logger logger = Logger.getLogger(BasicProgrammingRunner.class.getName());
	TimeTask timeObj = new TimeTask();
	BasicProgrammingTask taskObj = new BasicProgrammingTask();
	
	static {
		try {
			logger.setUseParentHandlers(false);
			FileHandler severeHandler = new FileHandler("severelog",true);
			FileHandler infoHandler = new FileHandler("infolog",true);
			severeHandler.setFormatter(new SimpleFormatter());
			infoHandler.setFormatter(new SimpleFormatter());
			severeHandler.setLevel(Level.SEVERE);
			infoHandler.setLevel(Level.INFO);
			infoHandler.setFilter(log->log.getLevel()==Level.INFO);
			logger.addHandler(infoHandler);
			logger.addHandler(severeHandler);
		}
		catch(Exception e) {
			logger.log(Level.SEVERE,"Error in handler creation",e);
		}
	}
	
	public static void main(String[] args) {
		BasicProgrammingRunner runnerObj = new BasicProgrammingRunner();
		
		boolean bool = true;
		int choice;
		while(bool) {
			try {
				System.out.print("Enter task number :");
				choice = Utility.getIntInput();
				switch(choice) {
					case 1:
						runnerObj.operationOne(System.getProperty("user.dir"));
						break;
					case 2:
						runnerObj.operationTwo(System.getProperty("user.dir"));
						break;
					case 3:
						runnerObj.operationThree(System.getProperty("user.dir"));
						break;
					case 4:
						runnerObj.operationFour();
						break;
					case 5:
						runnerObj.operationFive();
						break;
					case 6:
						runnerObj.operatonSix();
						break;
					case 7:
						runnerObj.operationSeven();
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
					case 12:
						runnerObj.operationTwelve();
						break;
				}
				
			}
			catch(Exception e) {
				logger.log(Level.SEVERE,"Error catched in main method ",e);

			}
		}
		
	}

	public void operationOne(String filePath) throws Exception{
		logger.info("Running Operation one");
		System.out.print("Enter File name ");
		String fileName = Utility.getStrInput();
		System.out.print("Enter no of lines  ");
		int noOfLines = Utility.getIntInput(),i;
		String[] strings = new String[noOfLines];
		for(i=0;i<noOfLines;i++) {
			System.out.print("Enter line "+(i+1)+" -");
			strings[i] = Utility.getStrInput();
		}
		taskObj.writeToFile(filePath, fileName, strings);
		logger.info("Successfully written to file ");

		
	}
	
	public void operationTwo(String filePath)throws Exception{
		logger.info("Running Operation Two");
		Properties myProperty = taskObj.getProperties();
		System.out.print("Enter number of key and value to be stored ");
		int noOfPairs = Utility.getIntInput(),i;
		String key,value;
		for(i=0;i<noOfPairs;i++) {
			System.out.print("Enter key "+(i+1)+" -");
			key = Utility.getStrInput();
			System.out.print("Enter value "+(i+1)+" -");
			value = Utility.getStrInput();
			taskObj.setToProperty(myProperty, key, value);
		}
		System.out.print("Enter comments to add ");
		String comments = Utility.getStrInput();
		String fileName;
		System.out.print("Enter File name ");
		fileName = Utility.getStrInput();
		taskObj.storeProperty(myProperty, filePath, fileName,comments);
		logger.info("Property set into the "+fileName+" file");

		
	}
	
	public void operationThree(String filePath) throws DataValidationException,IOException{
		// TODO Auto-generated method stub
		logger.info("Running Operation Three ");
		String  fileName;
		System.out.print("Enter file name ");
		fileName = Utility.getStrInput();	
		Properties property = taskObj.getProperties();
		property = taskObj.loadProperty(filePath, fileName);
		for(String key : taskObj.getStringPropertyName(property)) {
			logger.info("The key is "+key+" and its value is "+taskObj.getValue(property,key));
		}


	}
	
	public void operationFour()throws Exception {
		logger.info("Running Operation Four");
		String  filePath;
		System.out.print("Enter file Path ");
		filePath = Utility.getStrInput();
		if(taskObj.makeNewDirectory(filePath)) {
			logger.info("Running operation one ");
			operationOne(filePath+File.separator);
			logger.info("Running operation two ");
			operationTwo(filePath+File.separator);
			logger.info("Running operation three ");
			operationThree(filePath+File.separator);
		}
		else {
			throw new DataValidationException("Directory creation not failed");
		}
	}
	
	public void operationFive() {
		logger.info("Running Operation Five");
		System.out.print("Enter string to append ");
		String string = Utility.getStrInput();
		CustomeObject customeObj = new CustomeObject(string);
		logger.info("The object is "+customeObj);
	}
	
	public void operatonSix()throws DataValidationException {
		logger.info("Running Operation Six");
		System.out.print("Enter a string ");
		String string = Utility.getStrInput();
		System.out.print("Enter a integer value ");
		int integer = Utility.getIntInput();
		Test pojoObj =  new Test(string,integer);
		logger.info("Printing the created object "+pojoObj);
	}
	
	public void operationSeven() {
		logger.info("Running Operation Seven ");
		System.out.print("Enter a string ");
		String string = Utility.getStrInput();
		System.out.print("Enter a integer value ");
		int integer = Utility.getIntInput();
		Test pojoObj =  new Test();
		pojoObj.setInteger(integer);
		pojoObj.setString(string);
		logger.info("Printing the created object "+pojoObj);
	}
	
	public  void operationEight() throws Exception{
		try {
			logger.info("Running Operation Eight");
		Class<?> clazz = Class.forName("com.customeobject.Test");
		Constructor<?> defaultConstructor = clazz.getConstructor();
		Object testObjOne = defaultConstructor.newInstance();
		logger.info("The default constructor  "+testObjOne);
		System.out.print("Creating overloaded constructor \n Enter a string ");
		String string = Utility.getStrInput();
		System.out.print("Enter a integer value ");
		int integer = Utility.getIntInput();
		Constructor<?> overloadedCons = clazz.getConstructor(String.class,int.class);
		Object testObjTwo = overloadedCons.newInstance(string,integer);
		logger.info("The overloaded constructor  "+testObjTwo);
		System.out.print("Calling getter and setter using reflection \n Enter a string to invoke setter ");
		String setterString = Utility.getStrInput();
		System.out.print("Enter a integer value to invoke setter ");
		int setterInt = Utility.getIntInput();
		Method setterMethodOne = clazz.getDeclaredMethod("setString", String.class);
		setterMethodOne.invoke(testObjTwo,setterString);
		Method setterMethodTwo = clazz.getDeclaredMethod("setInteger",int.class);
		setterMethodTwo.invoke(testObjTwo, setterInt);
		Method getterMethodOne = clazz.getMethod("getString");
		String getStringMethod = (String) getterMethodOne.invoke(testObjTwo);
		logger.info("The string value from setter"+getStringMethod);
		Method getterMethodTwo = clazz.getMethod("getInteger");
		int getterInt  = (int)getterMethodTwo.invoke(testObjTwo);
		logger.info("The integer value from integer "+getterInt);	
		}
		catch(Exception e) {
			throw new DataValidationException("Eroor from runner method ",e);
		}
		
	}
	
	public void operationNine() {
		logger.info("Running Operation Nine");
		for(Rainbow rainbow:Rainbow.values()) {
			logger.info("The color is "+rainbow+" the value is "+rainbow.getValue());
			logger.info("The ordinal is "+rainbow.ordinal());
		}
	}
	
	public void operationTen() throws DataValidationException{
		logger.info("Running Operation Ten");
		LazyInitializeSingleton instanceOne  = LazyInitializeSingleton.getInstanceOfSingleton();
		EagerInitializeSingleton instanceTwo  = EagerInitializeSingleton.getInstanceOfEager();
		DoubleCheckSingleton instanceThree = DoubleCheckSingleton.getInstanceOfDoubleCheck();
		StaticBlockSingleton instanceFour = StaticBlockSingleton.getInstanceOfStaticBlock();
		BillPughSingleton instanceFive = BillPughSingleton.getInstanceOfBillPugh();
		ThreadSafeLazySingleton instanceSix = ThreadSafeLazySingleton.getInstanceOfThreadSafe();
		EnumSingleton instanceSeven = EnumSingleton.INSTANCE;
		logger.info("Eager initialize Singleton         "+instanceTwo);
		logger.info("Static Block initialize Singleton  "+instanceFour);
		logger.info("Lazy initialize Singleton          "+instanceOne);
		logger.info("Threadsafe initialize Singleton    "+instanceSix);
		logger.info("Double Check initialize Singleton  " +instanceThree);
		logger.info("BillPugh initialize Singleton      "+instanceFive);
		logger.info("Enum initialize Singleton          "+instanceSeven);
	}
	
	public void operationEleven() throws Exception{
		System.out.print("Enter ZoneId ");
        String zone =Utility.getStrInput();
		logger.info("Running Operation Eleven");
		String format = getFormat();
		logger.info(timeObj.getZonedDateTime(ZoneId.of(zone),format));
		logger.info("LocalTime in milli Seconds  "+timeObj.getTimeInMillis());
		logger.info("Time in millis using SystemCurrentMillis"+timeObj.getSystemCurrentMillis());
		printAvailableZoneId();

		String zoneIdFormat = getFormat();
		logger.info("The current time for entered zone is "+timeObj.getZonedDateTime(timeObj.getZoneId(zone),zoneIdFormat));
       
        System.out.print("Enter millis ");
        long millis = Utility.getLongInput();
		DayOfWeek dayOfWeek = timeObj.getDayOfWeekFromMillis(millis,timeObj.getZoneId(zone));
		logger.info("The day of week is "+dayOfWeek);
		Month month = timeObj.getMonthFromMillis(millis,timeObj.getZoneId(zone));
		logger.info("The month from millis is "+month);
		int year = timeObj.getYearFromMillis(millis,timeObj.getZoneId(zone));
		logger.info("Year from millis is "+year);
		

		
	
	}
	
	public String getFormat() {
		System.out.println("Enter a format for date yyyy-year;MM-month;dd-Day of month;D-day of Year;W-week of month");
		System.out.println("Enter format for time H-hour;m-minute;s-secinds;A-milli second;n-nano second;V-zoneID;z-time-zone name");
		System.out.println("Eg : dd-MM-yyyy : HH:mm:ss");
		String format = Utility.getStrInput();
		return format;
	}
	
	public void operationTwelve() throws DataValidationException{
		try {
		logger.info("Running Operation Twelve");
		System.out.print("Enter ZoneId ");
	    String zone =Utility.getStrInput();
	    System.out.print("Enter Year");
	    int year = Utility.getIntInput();
	    System.out.print("Enter month (1-12 )");
	    int month = Utility.getIntInput();
	    System.out.print("Enter date(1-31)");
	    int date = Utility.getIntInput();
	    System.out.print("Enter Hour ");
	    int hour = Utility.getIntInput();
	    System.out.print("Enter minute");
	    int minute = Utility.getIntInput();
	    System.out.print("Enter seconds");
	    int second = Utility.getIntInput();
	    System.out.print("Enter nano Second ");
	    int nanoSec = Utility.getIntInput();
		logger.info(" Offeset is "+timeObj.getDSTOffset(year,month,date,hour,minute,second,nanoSec,timeObj.getZoneId(zone)));
		}
		catch(Exception e) {
			throw new DataValidationException("Error in operation twelve",e);
		}
		
	}
	public void printAvailableZoneId() {
		String[] availableZones = timeObj.getSortedAvailableZoneId();
		for (String zone : availableZones) {
			System.out.println(zone);
		}
	}
	

}
