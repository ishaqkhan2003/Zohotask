package com.arraylist.runner;
import com.arraylist.task.ArrayListTask;
import java.util.Iterator;
import com.utility.Utility;
import java.util.List;
import com.customeobject.CustomeObject;
import com.exceptionhandling.DataValidationException;
public class ArrayListRunner {
	private String type;
	ArrayListTask taskObj =  new ArrayListTask();
	public static void main(String[] args){
		ArrayListRunner runnerObj =  new ArrayListRunner();
		runnerObj.setType();
		boolean bool =  true;
		int choice;
		runnerObj.showTask();
		while (bool){
			System.out.print("Enter Task Number  :");
			choice = Utility.getIntInput();
			try {
				switch ( choice ){
					case 1:
							runnerObj.operationOne();
							break;
					case 2:
							runnerObj.operationTwo();
							break;
					case 3:
							runnerObj.operationThree();
							break;
					case 4:
							runnerObj.operationFour();
							break;
					case 5:
							runnerObj.operationFive();
							break;
					case 6:
							runnerObj.operationSix();
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
					case 13:
							runnerObj.operationThirteen();
							break;
					case 14:
							runnerObj.operationFourteen();
							break;
					case 15:
							runnerObj.operationFifteen();
							break;
					case 16:
							runnerObj.operationSixteen();
							break;
					case 17:
							runnerObj.operationSeventeen();
							break;
					case 18:
							runnerObj.operationEighteen();
							break;
					case 19:
							bool = false;
							break;
					case 20:
							runnerObj.showTask();
							break;
					default :
							System.out.println("Enter a valid choice ");
							break;
				}
			}
			catch ( Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void setType() {
		try {
			//BasicProgrammingTask basicProgObj = new BasicProgrammingTask();	
			//Properties property = basicProgObj.loadProperty("/home/mohammed-pt7828/eclipse-workspace/Zohotask","config");
			//type = basicProgObj.getValue(property, "listImplementation");	
			type = System.getProperty("listImplementation");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showTask() {
		//System.out.println(System.getProperty("user-dir"));
		//System.out.println(type);
		System.out.println("1.To create an ArrayList ");
		System.out.println("2.To create String ArrayList and add string ");
		System.out.println("3.To create Integer ArrayList and add int ");
		System.out.println("4.To create CustomeObject ArrayList and add object ");
		System.out.println("5.To create Object ArrayList and add String,Integer,Object");
		System.out.println("6.To create String ArrayList and find index");
		System.out.println("7.To create Strnig ArrayList and use Iterator ");
		System.out.println("8.To create an ArrayList and print string at given index ");
		System.out.println("9.To create an ArrayList and find first and last index of duplicate string");
		System.out.println("10.To create an ArrayList and insert string ");
		System.out.println("11.To create an ArrayList and create subList  ");
		System.out.println("12.To create two  ArrayList and create another ArrayList in sequence ");
		System.out.println("13.To create an ArrayList create another ArrayList in reverse sequence  ");
		System.out.println("14.To create an ArrayList and remove a value ");
		System.out.println("15.To create two ArrayList and deletet same element ");
		System.out.println("16.To create an ArrayList and retain same element ");
		System.out.println("17.To create an long ArrayList and remove all element ");
		System.out.println("18.To create an ArrayList and check if String is present ");
		System.out.println("19.Exit ");
		System.out.println("20. show menu ");
	}
	
	public <T> void printArrayList(List<T> arrayList) throws DataValidationException{
		Utility.checkNull(arrayList);
		System.out.println("The Array List is "+arrayList);
	}
	public <T> void printArrayListSize(List<T> arrayList)throws DataValidationException{
		System.out.println("The size of Array List is = "+taskObj.getListSize(arrayList));	
	}
	public void operationOne() throws Exception {
		try {
			List<Object> newArrayList = taskObj.getArrayList(type);
			printArrayListSize(newArrayList);
		}
		catch ( DataValidationException e){
			throw new DataValidationException("Error from runner class ",e);
		}
	}
	
	public void operationTwo() throws Exception{
		try{
			List<String> stringArrayList = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayList);
			printArrayList(stringArrayList);
			printArrayListSize(stringArrayList);			
		}
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}	
	}
	
	public void operationThree() throws Exception{
		try{
			List<Integer> intArrayList = taskObj.getArrayList(type);
			addIntToArrayList(intArrayList);
			printArrayList(intArrayList);
			printArrayListSize(intArrayList);
				
		}
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
		
	}
	
	public void operationFour() throws Exception{
		try{
			List<CustomeObject> customeArrayList = taskObj.getArrayList(type);
			System.out.print("Enter number of objects to be added  ");
			int noOfObj = Utility.getIntInput(),i;
			for ( i = 0;i<noOfObj;i++){
				CustomeObject customeObj =  new CustomeObject("customeObj_"+(i+1));
			taskObj.addToList(customeArrayList,customeObj);
			}
			printArrayList(customeArrayList);
			printArrayListSize(customeArrayList);
			
		}
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationFive()throws Exception{
		try{
			List<Object> objArrayList = taskObj.getArrayList(type);
			System.out.print("Enter Number of Strings to add ");
			int noOfString = Utility.getIntInput(),i;
			for (i=0;i<noOfString;i++){
				System.out.print("Enter String "+(i+1)+"- ");
				taskObj.addToList(objArrayList,Utility.getStrInput());
			}
			System.out.print("Enter number of Intergers to add ");
			int noOfInt = Utility.getIntInput();
			for (i=0;i<noOfInt;i++){
				System.out.print("Enter integer "+(i+1)+"- ");
				taskObj.addToList(objArrayList,Utility.getIntInput());
			}
			System.out.print("ENter number of objects to be added  ");
			int noOfObj = Utility.getIntInput();
			for ( i = 0;i<noOfObj;i++){
				CustomeObject customeObj =  new CustomeObject("customeObj_"+(i+1));
			taskObj.addToList(objArrayList,customeObj);
			}
			printArrayList(objArrayList);
			printArrayListSize(objArrayList);
					
			
		}		
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationSix() throws Exception{
		try{
		List<String> stringArrayList = taskObj.getArrayList(type);
		addStringToArrayList(stringArrayList);				
		printArrayList(stringArrayList);
		printArrayListSize(stringArrayList);
		System.out.println("Enter the string whose index is needed ");
		String findString = Utility.getStrInput();
		int index =  taskObj.getIndexOf(stringArrayList,findString);
		if ( index == -1 ){
			System.out.println("The entered element is not present ");
		}
		else{
			System.out.println("The index of entered string is "+index);
		}
		}		
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
				
	}
	public void operationSeven() throws Exception{
		try{
			List<String> stringArrayList = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayList);
			printArrayList(stringArrayList);
			printArrayListSize(stringArrayList);
			//Using iterator method
			System.out.println("Using Iterator ");
			Iterator<String> iter = taskObj.getIterator(stringArrayList);
			while(iter.hasNext()){
				System.out.print(iter.next()+" ");
			}
			System.out.println("\nUsing for loop ");
			int sizeOfArrayList = taskObj.getListSize(stringArrayList),i;
			for(i= 0 ;i<sizeOfArrayList;i++){
				System.out.print(stringArrayList);
			}
			
		}		
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationEight() throws Exception{
		try{
			List<String> stringArrayList = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayList);			
			printArrayList(stringArrayList);
			printArrayListSize(stringArrayList);
			System.out.print("Enter index of string ");
			int index = Utility.getIntInput();
			System.out.println("The string at given index is "+taskObj.getElementAt(stringArrayList,index));
		}				
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationNine() throws Exception{
		try{
			List<String> stringArrayList = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayList);			
			printArrayList(stringArrayList);
			printArrayListSize(stringArrayList);
			System.out.print("Enter the Duplicate string  ");
			String duplicate = Utility.getStrInput();
			int firstIndex,lastIndex;
			firstIndex = taskObj.getIndexOf(stringArrayList,duplicate);
			lastIndex = taskObj.getLastIndexOf(stringArrayList,duplicate);
			if ( firstIndex == -1){
				System.out.println("The entered string is not present  ");
			}
			else{
				System.out.print(" The first index of duplicate string is "+firstIndex);
				System.out.print(" The last index of duplicate string is "+lastIndex);
				System.out.println("\n");
			}
		}
				
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
		}
	public void operationTen() throws Exception{
		try{
			List<String> stringArrayList = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayList);
			System.out.print("Enter String to insert ");
			String insertString = Utility.getStrInput();
			System.out.print("Enter index to insert ");
			int index = Utility.getIntInput();
			taskObj.insertToList(stringArrayList,insertString,index);
			printArrayList(stringArrayList);
			printArrayListSize(stringArrayList);
		}		
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationEleven()throws Exception{
		try{
			List<String> stringArrayListOne = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayListOne);
			System.out.print("Enter From Index ");
			int fromIndex = Utility.getIntInput();
			System.out.print("Enter to index :");
			int toIndex = Utility.getIntInput();
			List<String> stringArrayListTwo = taskObj.getArrayList(type);
			taskObj.getSubList(stringArrayListOne,stringArrayListTwo,fromIndex,toIndex);
			printArrayList(stringArrayListOne);
			printArrayListSize(stringArrayListOne);
			printArrayList(stringArrayListTwo);
			printArrayListSize(stringArrayListTwo);
		}		
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationTwelve() throws Exception{
		try{
			List<String> stringArrayListOne = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayListOne);
			List<String> stringArrayListTwo = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayListTwo);
			List<String> stringArrayListThree = taskObj.getArrayList(type);
			taskObj.createList(stringArrayListThree,stringArrayListOne);
			taskObj.createList(stringArrayListThree,stringArrayListTwo);
			printArrayList(stringArrayListThree);
			printArrayListSize(stringArrayListThree);
		}		
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationThirteen() throws Exception{
		try{
			List<String> stringArrayListOne = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayListOne);
			List<String> stringArrayListTwo = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayListTwo);
			List<String> stringArrayListThree = taskObj.getArrayList(type);
			taskObj.createList(stringArrayListThree,stringArrayListTwo);
			taskObj.createList(stringArrayListThree,stringArrayListOne);
			printArrayList(stringArrayListThree);
			printArrayListSize(stringArrayListThree);
			
		}				
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationFourteen() throws Exception{
		try{
			List<Float> floatArrayList = taskObj.getArrayList(type);
			addFloatToArrayList(floatArrayList);
			System.out.print("Enter index for deletion ");
			int index = Utility.getIntInput();
			taskObj.removeElementAt(floatArrayList,index);
			printArrayList(floatArrayList);
			printArrayListSize(floatArrayList);
			
		}				
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationFifteen() throws Exception{
		try{
			List<String> stringArrayListOne = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayListOne);
			List<String> stringArrayListTwo = taskObj.getArrayList(type);
			System.out.print("Enter form index ");
			int fromIndex = Utility.getIntInput();
			System.out.print("Enter to index :");
			int toIndex = Utility.getIntInput();
			taskObj.getSubList(stringArrayListOne,stringArrayListTwo,fromIndex,toIndex);
			printArrayList(stringArrayListOne);
			printArrayListSize(stringArrayListOne);
			printArrayList(stringArrayListTwo);
			printArrayListSize(stringArrayListTwo);
			taskObj.removeAllFromList(stringArrayListOne,stringArrayListTwo);
			System.out.println("After removing elemts ");
			printArrayList(stringArrayListOne);
			printArrayListSize(stringArrayListOne);	
		}				
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationSixteen() throws Exception{
		try{
			List<String> stringArrayListOne = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayListOne);
			List<String> stringArrayListTwo = taskObj.getArrayList(type);
			System.out.print("Enter form index ");
			int fromIndex = Utility.getIntInput();
			System.out.print("Enter to index :");
			int toIndex = Utility.getIntInput();
			taskObj.getSubList(stringArrayListOne,stringArrayListTwo,fromIndex,toIndex);
			printArrayList(stringArrayListOne);
			printArrayListSize(stringArrayListOne);
			printArrayList(stringArrayListTwo);
			printArrayListSize(stringArrayListTwo);
			taskObj.retainAllFromList(stringArrayListOne,stringArrayListTwo);
			printArrayList(stringArrayListOne);
			printArrayListSize(stringArrayListOne);
			
		}				
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationSeventeen()throws Exception{
		try{
			List<Long> longArrayList= taskObj.getArrayList(type);
			addLongToArrayList(longArrayList);
			taskObj.clearAll(longArrayList);
			printArrayList(longArrayList);
			printArrayListSize(longArrayList);
			
		}				
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void operationEighteen()throws Exception{
		try{
			List<String> stringArrayList = taskObj.getArrayList(type);
			addStringToArrayList(stringArrayList);
			System.out.print(" Enter string to check ");
			String string = Utility.getStrInput();
			boolean check = taskObj.containsElement(stringArrayList,string);
			if(check){
				System.out.println("The string is present ");
			}
			else{
				System.out.println("The string is not present ");
			}
		}				
		catch ( DataValidationException e ){
			throw new DataValidationException("Error from Runner class ",e);
		}
	}
	public void addIntToArrayList(List<Integer> arrayList)throws DataValidationException{
		System.out.print("Enter number of Intergers to add ");
		int noOfInt = Utility.getIntInput(),i;
		for (i=0;i<noOfInt;i++){
			System.out.print("Enter integer "+(i+1)+"- ");
			taskObj.addToList(arrayList,Utility.getIntInput());
		}
		
	}
	public void addStringToArrayList(List<String> arrayList) throws DataValidationException{
		System.out.print("Enter Number of Strings to add ");
		int noOfString = Utility.getIntInput(),i;
		for (i=0;i<noOfString;i++){
			System.out.print("Enter String "+(i+1)+" - ");
			taskObj.addToList(arrayList,Utility.getStrInput());
		}	
	}
	public void addFloatToArrayList(List<Float> arrayList) throws DataValidationException{
		System.out.print("Enter Number of Deciamls to add ");
		int noOfFloats = Utility.getIntInput(),i;
		for (i=0;i<noOfFloats;i++){
			System.out.print("Enter Decimal  "+(i+1)+" - ");
			taskObj.addToList(arrayList,Utility.getFloatInput());
		}
		
	}
	public void addLongToArrayList(List<Long> arrayList)throws DataValidationException{
		System.out.print("Enter Number of long value to add ");
		int noOfLong = Utility.getIntInput(),i;
		for (i=0;i<noOfLong;i++){
			System.out.print("Enter LOng value  "+(i+1)+" - ");
			taskObj.addToList(arrayList,Utility.getLongInput());
		}
		
	}

}