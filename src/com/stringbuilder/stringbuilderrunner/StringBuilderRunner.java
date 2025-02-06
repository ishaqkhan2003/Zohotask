package com.stringbuilder.stringbuilderrunner;
import java.util.Scanner;
import java.util.List;
import com.exceptionhandling.DataValidationException;
import com.utility.Utility;
import com.stringbuilder.stringbuildertask.StringBuilderTask;
public class StringBuilderRunner{
	StringBuilderTask taskObj = new StringBuilderTask();
	public static void main(String[] args){
		StringBuilder strBuilder;
		String string,delimiter;
		StringBuilderRunner runnerObj = new StringBuilderRunner();
		String[] strArray;
		Scanner scanner = new Scanner(System.in);
		boolean bool  = true;
		int i,noOfStr,start,end,lengthOfStr,insertIndex,index;
		System.out.println("ENTER TASK NUMBER 1-10 AND 11 TO EXIT");
		runnerObj.showTask(scanner);
		while(bool){
			System.out.print("ENTER TASK NUMBER ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			try {
			switch (choice){
			case 1 :
					strBuilder =   runnerObj.createStrBuilder();
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					strBuilder = runnerObj.appendString(strBuilder,strArray);
					runnerObj.printLengthOfStrBldr(strBuilder);
					System.out.println("The Final String is " + strBuilder.toString());
					break;
			case 2 :
					System.out.println("Enter a string  ");
					string = scanner.nextLine();
					strBuilder = runnerObj.createStrBuilder(string);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					strBuilder = runnerObj.appendString(strBuilder,strArray,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					break;
			case 3 :
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();					
					strBuilder = runnerObj.createStrBuilder(strArray,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					System.out.print("Enter a string to insert ");
					string = scanner.nextLine();
					System.out.print("Enter position for insertion ");
					insertIndex = scanner.nextInt();
					scanner.nextLine();
					runnerObj.insertString(strBuilder,string,delimiter,insertIndex);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					break;
			case 4 : 
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();					
					strBuilder = runnerObj.createStrBuilder(strArray,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);	
					strBuilder = runnerObj.delString(strBuilder,1,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					break;
			case 5 : 
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();					
					strBuilder = runnerObj.createStrBuilder(strArray,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);	
					runnerObj.printStrbuilder(strBuilder);					
					System.out.print("Enter  new delimitting char ");
					String newDelimiter = scanner.nextLine();
					runnerObj.replaceChar(strBuilder,delimiter,newDelimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					break;
			case 6 :					 
					System.out.print("Enter no of strings to add ");
					noOfStr = scanner.nextInt();
					scanner.nextLine();
					strArray = runnerObj.appendToStrArray(noOfStr,scanner);
					System.out.print("Enter delimitting char ");
					delimiter = scanner.nextLine();					
					strBuilder = runnerObj.createStrBuilder(strArray,delimiter);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					runnerObj.reverseStrBuilder(strBuilder);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					break;
			case 7 : 
					string = runnerObj.createStr(scanner);
					strBuilder = runnerObj.createStrBuilder(string);
					runnerObj.printLengthOfStrBldr(strBuilder);
					while(true){
					System.out.print("Enter starting index ");
					start = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter ending index ");
					end = scanner.nextInt();
					scanner.nextLine();
					lengthOfStr = Utility.getLength(strBuilder);
					if ( start >= 0 && end < lengthOfStr-1){
						break;
					}
					System.out.print("Index out of Range , Re-enter index ");
					}
					strBuilder = runnerObj.delString(strBuilder,start,end);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);
					break;
			case 8 :
					string = runnerObj.createStr(scanner);
					strBuilder = runnerObj.createStrBuilder(string);
					runnerObj.printLengthOfStrBldr(strBuilder);
					while (true ){
						System.out.print("Enter starting index ");
						start = scanner.nextInt();	
						scanner.nextLine();
						System.out.print("Enter ending index ");
						end = scanner.nextInt();
						scanner.nextLine();						
						lengthOfStr = Utility.getLength(strBuilder);
						if ( start >= 0 && end < lengthOfStr-1){
							break;
						}
						System.out.print("Index out of Range , Re-enter index ");
						}
					System.out.print("Enter replacement string ");
					String replacementStr = scanner.nextLine();
					strBuilder = runnerObj.replaceString(strBuilder,start,end,replacementStr);
					runnerObj.printLengthOfStrBldr(strBuilder);
					runnerObj.printStrbuilder(strBuilder);						
					break;					
			case 9 :
					index = runnerObj.findIndexOf(scanner);
					System.out.println("The index of delimiter is "+ index);
					break;
			case 10 :					 
					
					index = runnerObj.findIndexOf(scanner);
					System.out.println("The index of delimiter is "+ index);
					break;
			case 11 :
					bool = false;
					break;
			case 12 :
					runnerObj.showTask(scanner);
					break;
			default :
					System.out.println("Enter a valid task ");
					break;					
			}
			}
			catch ( DataValidationException e){
				e.printStackTrace();
			}
		}
	}
	public void showTask(Scanner scanner){
		System.out.println("Task Menu :");
		System.out.println("1. Add a String ");
		System.out.println("2. String with separator ");
		System.out.println("3. Insert a String ");
		System.out.println("4. Delete a String using position ");
		System.out.println("5. Replace delimiter position ");
		System.out.println("6. Reverse a String");
		System.out.println("7. Delete String using index");
		System.out.println("8. Replace String using index ");
		System.out.println("9. Print last index of delimiter ");
		System.out.println("10. Print first index of delimiter ");
		System.out.println("11. Exit ");
		System.out.println("12. Show menu ");
	}
	public String[] appendToStrArray(int noOfStr,Scanner scanner){
		System.out.println("Enter "+noOfStr+ " string ");
		String string;
		String[] strArray =  new String[noOfStr];
		for (  int i = 0;i<noOfStr;i++){
			string = scanner.nextLine();
			strArray[i]= string ;
		}
		return strArray;
	}
	public List appendToList(List<String> strList,int noOfStr,Scanner scanner){
		System.out.println("Enter "+noOfStr+ " string ");
		String string;
		for (  int i = 0;i<noOfStr;i++){
			string = scanner.nextLine();
			strList.add(string);
		}
		return strList;
	}
		
	public void printStrbuilder(StringBuilder strBuilder){
		System.out.println("The String is " + strBuilder.toString());
	}
	public void printLengthOfStrBldr(StringBuilder strBuilder)throws DataValidationException{
		try{
			System.out.println("The Length of string is = " + Utility.getLength(strBuilder));
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder createStrBuilder() {		
		 return taskObj.getStrBuilder();
	}
	public StringBuilder createStrBuilder(String str) {
		return taskObj.getStrBuilder(str);
	}
	public StringBuilder createStrBuilder(String[] strArray,String delimitingChar) throws DataValidationException{
		return taskObj.getStrBuilder(strArray,delimitingChar);
	}

	public StringBuilder appendString(StringBuilder strBuilder,String[] strArray) throws DataValidationException{
		try{
			return taskObj.appendToStrBuilder(strBuilder,strArray);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder appendString(StringBuilder strBuilder,String[] strArray,String delimitingChar) throws DataValidationException{
		try{
			return taskObj.appendToStrBuilder(strBuilder,strArray,delimitingChar);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder insertString(StringBuilder strBuilder,String string,String delimiter,int index) throws DataValidationException{
		try{
			return taskObj.insertToStrBuilder(strBuilder,string,delimiter,index);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder delString(StringBuilder strBuilder,int start,int end) throws DataValidationException{
		try{
			return taskObj.delFromStrBuilder(strBuilder,start,end);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder delString(StringBuilder strBuilder,int position,String delimiter) throws DataValidationException{
		try{
			return taskObj.delFromStrBuilder(strBuilder,position,delimiter);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder replaceChar(StringBuilder strBuilder,String oldDelimiter,String newDelimiter) throws DataValidationException{
		try{
			return taskObj.replaceStringInStrBuilder(strBuilder,oldDelimiter,newDelimiter);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder reverseStrBuilder(StringBuilder strBuilder) throws DataValidationException{
		try{
			return taskObj.reverseStrBuilder(strBuilder);
		}
		catch(DataValidationException e){
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public StringBuilder replaceString(StringBuilder strBuilder,int start,int end,String replacementString) throws DataValidationException{
		try{
			return taskObj.replaceStringInStrBuilder(strBuilder,start,end,replacementString);
		}
		catch(DataValidationException e)
		{
			throw new DataValidationException("ERROR FROM RUNNER ",e);
		}
	}
	public String createStr(Scanner scanner) throws DataValidationException{
		System.out.print("Enter minimum number of characters  ");
		int minChar = scanner.nextInt();
		scanner.nextLine();
		System.out.print("ENTER A STRING ");
		String string = scanner.nextLine();
		int lengthOfStr =  Utility.getLength(string);
		if ( lengthOfStr < minChar ){
		while (true){
			
			System.out.print("THE LENGTH IS LESS THAN "+minChar+"ENTER A STRING ");
			string = scanner.nextLine();
			lengthOfStr =  Utility.getLength(string);
			if ( lengthOfStr > minChar ){
				break;
			}
			}
		}	
		return string;
	}
	public int findIndexOf(Scanner scanner) throws DataValidationException{
		int index=0,position;
		System.out.print("Enter no of strings to add ");
		int noOfStr = scanner.nextInt();
		scanner.nextLine();
		String[] strArray = appendToStrArray(noOfStr,scanner);
		System.out.print("Enter delimitting char ");
		String delimiter = scanner.nextLine();					
		StringBuilder strBuilder = createStrBuilder(strArray,delimiter);
		printStrbuilder(strBuilder);
		System.out.println("Position of delimiter \n1. For first index \n2. For last index \n3.For custom index ");
		int choice = scanner.nextInt();
		scanner.nextLine();
		switch(choice ){
			case 1 :
					index =  taskObj.getFirstIndexOfStr(strBuilder,delimiter);
					break;
			case 2 :
					index =  taskObj.getLastIndexOf(strBuilder,delimiter);
					break;
			case 3 :
					System.out.print("Enter custom Index ");
					position = scanner.nextInt();
					scanner.nextLine();
					index = taskObj.getCustomIndexOf(strBuilder,delimiter,position);
					break;
			default :
					System.out.print("Enter valid option ");
					break;
		}	
	
		return index;		
	}
	
}

	
	
						
