package com.string.stringrunner;
import com.string.stringtask.StringTask;
import java.util.Scanner;
import java.util.ArrayList;
import com.exceptionhandling.DataValidationException;
public class StringTestRunner
{
	 
	StringTask taskObj = new StringTask();
	public static void main(String[] args)
	{
		 
		StringTestRunner runnerObj = new StringTestRunner();
		Scanner scanner = new Scanner(System.in);
		boolean bool  = true;
		runnerObj.printTasks();
		while(bool)
		{
		System.out.print("Enter the task number ");
		int choice = scanner.nextInt();
		scanner.nextLine();
		try
		{
		switch (choice)
			{
			case 1:
					runnerObj.findLengthOfString(args[0]);
					
					break;
			case 2 :
					runnerObj.convertToCharArray(scanner);		
					break;					
			case 3 :
					runnerObj.getPenultimateChat(scanner);
					break;
			case 4 :
					runnerObj.findNoOfOccurance(scanner);
					break;					
			case 5 :
					runnerObj.findGreatestPos(scanner);
					break;
			case 6 :
					runnerObj.findLastFiveChar(scanner);
					break;					
			case 7 :
					runnerObj.getFirstThreechar(scanner);
				 	break;
					
			case 8 :
					runnerObj.replaceWithXYZ(scanner);
					break;
			case 9 :
					runnerObj.checkStartsWithEnt(scanner);
					break;
			case 10 :
					runnerObj.checkEndsWithLe(scanner);
					break;
			case 12 :
					runnerObj.convertLowerCaseStr(scanner);
					break;					
			case 11 :
					runnerObj.convertUpperCaseStr(scanner);
					break;
			case 13 :
					runnerObj.reverseString(scanner);
					break;
								
			case 14 :
					runnerObj.getMultipleStrInput(scanner);
					break;
			case 15 :
					runnerObj.concatenateString(scanner);
					break;
			case 16 :
					runnerObj.convertToStrArray(scanner);	
					break;
			case 17 :
					runnerObj.toMergeString(scanner);
					break;
			case 18 :
					runnerObj.compareStrCaseSensitive(scanner);
					break;
			case 19 :
					runnerObj.compareStrCsaseInsensitive(scanner);
					break;
			case 20 :
					runnerObj.trimWhiteSpace(scanner);
					break;
			case 21 :
					bool = false;
					break;
			case 22:
					runnerObj.printTasks();
					break;			
			default :
					System.out.println("PLEASE ENTER A VALID TASK NUMBER ");
					break;			
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
		scanner.close();
	}
	public void printTasks(){
		System.out.println("1.Find Length of string \n2.Convert String to character array\n3.To find the penultimate character\n4.Find number of occurance of a character"+
									"\n5.Find greatest position of a character\n6.To print last 5 character of string\n7.To print first 3 character\n8.Replace first character with XYZ"+
									"\n9.To check if string starts with ent\n10.To check if string ends with le\n11.Convert into lowercase\n12.Convert into uppercase"+
									"\n13.To reverse a string\n14.Accept string line with multiple strings\n15.Accept multiple line string and remove space\n16.Accept multiple line string and enclose into string  array"+ 
									"\n17.Accept multiple line string and merge with -\n18.To compare string case sensitive\n19.To compare string case insensitive"+
									"\n20.To trim the space at end or beginning\n21.Exit\n22.Show task Menu");	
	}
		
	public String getInputString(Scanner scanner){
		System.out.print("ENTER A STRING TO CONVERT");
		return scanner.next();
	}
		
	public void findLengthOfString(String str) throws DataValidationException
	{
		try	
		{
			int length = taskObj.getLength(str);
			System.out.println("THE LENGTH OF THE STRING IS = "+ length);
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void convertToCharArray(Scanner scanner) throws DataValidationException
	{
		try
		{ 
			String str = getInputString(scanner);
			char[] chrArray = taskObj.toCharacterArray(str); 
			for ( char c : chrArray)
			{
				System.out.print(c);
				System.out.print(",");
			}
			System.out.println();
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void getPenultimateChat(Scanner scanner) throws DataValidationException
	{
		try
		{
			String  str = getInputString(scanner);
			System.out.println("THE PENULTIMATE CHARACTER IS = "+ taskObj.getCharFromLast(str,-2));
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void findNoOfOccurance(Scanner scanner) throws DataValidationException
	{
		try
		{
			String  str = getInputString(scanner);
			System.out.print("ENTER A CHAR TO FIND NUMBER OF OCCURENCE :");
			char character = scanner.next().charAt(0);
			int occurance = taskObj.numberOfOccurance(str,character);
			System.out.printf("THE NUMBER OF TIMES %c OCCURRED IS = %d",character,occurance);
			System.out.println();
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void findGreatestPos(Scanner scanner) throws DataValidationException
	{
		try 
		{
			String  str = getInputString(scanner);
			System.out.println("ENTER A CHAR TO FIND GREATEST POSITION OF IT :");
			char character  = scanner.next().charAt(0);
			System.out.printf("THE LAST OCCURANCE OF %c IS AT THE INDEX %d ",character,taskObj.getGreatestPosition(str,character));
			System.out.println();
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void findLastFiveChar(Scanner scanner) throws DataValidationException
	{
		try
		{ 
			String  str = getInputString(scanner);
			String  lastCharacters = taskObj.getLastCharacters(str,5);
			System.out.println("THE SUBSTRING IS "+ lastCharacters);
		}
		catch (DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void getFirstThreechar(Scanner scanner) throws DataValidationException
	{
		try
		{
			String  str = getInputString(scanner);
			String firstThreeChar = taskObj.getFirstCharacters(str,3);
			System.out.println("THE FIRST THREE CHARACTER IS "+ firstThreeChar);
		}
		catch (DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}	
	}
	public void replaceWithXYZ(Scanner scanner) throws DataValidationException
	{
		try 
		{	
			String  str = getInputString(scanner);
			String replacedString = taskObj.replaceFromPrefix(str,"XYZ",3);
			System.out.println("THE NEW REPLACED STRING IS "+ replacedString);
			}

		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void checkStartsWithEnt(Scanner scanner) throws DataValidationException
	{
		try 
		{
			String  str = getInputString(scanner);
			boolean flag = taskObj.checkStartsWith(str,"ent");
			if ( flag == true)
			{
				System.out.println("THE GIVEN STRING STARTS WITH ent ");
			}
			else 
			{
				System.out.println("THE GIVEN STRING DOESNOT START WITH ent");
			}
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void checkEndsWithLe(Scanner scanner) throws DataValidationException
	{
		try 
		{	
			String  str = getInputString(scanner);
			boolean check = taskObj.checkEndsWith(str,"le");
			if ( check ==  true)
			{
				System.out.println("THE GIVEN STRING ENDS WITH le ");
			}
			else 
			{
				System.out.println("THE GIVEN STRING DOESNOT ENDS WITH le ");
			}					
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void convertUpperCaseStr(Scanner scanner) throws DataValidationException
	{
		try
		{
			String  str = getInputString(scanner);
			String upperCasedString = taskObj.toUpperCasedString(str);
			System.out.println("THE UPPER CASED STRING IS "+ upperCasedString);
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void convertLowerCaseStr(Scanner scanner) throws DataValidationException
	{
		try 
		{
			String  str = getInputString(scanner);
			String loweredString = taskObj.toLowerCasedString(str);
			System.out.println("THE LOWER CASE STRING IS "+ loweredString);
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void reverseString(Scanner scanner) throws DataValidationException
	{
		try
		{
			String  str = getInputString(scanner);
			String reversedString = taskObj.toReverseString(str);
			System.out.println("THE REVERSED STRING IS ");
			System.out.println(reversedString);
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);

		}
	}
	public void getMultipleStrInput(Scanner scanner) throws DataValidationException
	{
		try{
			String  str = getInputString(scanner);
			String multipleStringInput = taskObj.getMultipleString(str);
			System.out.println("THE MULTIPLE STRING LINE IS = "+ multipleStringInput );
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void concatenateString(Scanner scanner) throws DataValidationException
	{
		try{
			String  str = getInputString(scanner);
			System.out.println(taskObj.changeDelimitter(str," ",""));
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void convertToStrArray(Scanner scanner) throws DataValidationException
	{
		try
		{
			String  str = getInputString(scanner);
			String[] stringArray = taskObj.toConvertStringArray(str," ");
			System.out.println("THE CONVERTED STRING ARRAY IS =  ");
			System.out.print("{");
			for ( String s : stringArray)
			{
				System.out.print("\"" + s + "\"");
				System.out.print(",");						
			}
			System.out.println("}");
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void toMergeString(Scanner scanner) throws DataValidationException
	{
		try{
			System.out.print("ENTER NO. OF STRINGS ");
			int count = scanner.nextInt();
			scanner.nextLine();
			ArrayList<String> stringArrayList = new ArrayList<>();
			System.out.printf("ENTER %d STRINGS ",count); 
			for ( int i =1 ;i<= count;i++)
			{ 
				stringArrayList.add(scanner.nextLine());
			}
			String concatenatedStringList = taskObj.concatStrings(stringArrayList,"-");
			System.out.println(concatenatedStringList);
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void compareStrCaseSensitive(Scanner scanner) throws DataValidationException
	{
		try
		{
			String stringOne = getInputString(scanner);
			String stringTwo = getInputString(scanner);
			
			int checkEquals = taskObj.compareCaseSensitiveStrings(stringOne,stringTwo);
			if ( checkEquals == 0)
			{
				System.out.println("THE TWO STRINGS ARE EQUAL ");
			}
			else 
			{
				System.out.println("THE TWO STRING ARE NOT EQUAL ");
			}
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void compareStrCsaseInsensitive(Scanner scanner) throws DataValidationException
	{
		try
		{
			
			String stringOne = getInputString(scanner);
			String stringTwo = getInputString(scanner);
			int equalsCheck = taskObj.compareCaseInSensitiveStrings(stringOne,stringTwo);
			if ( equalsCheck == 0)
			{
				System.out.println("THE TWO STRINGS ARE EQUAL ");
			}
			else 
			{
				System.out.println("THE TWO STRING ARE NOT EQUAL ");
			}
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}
	public void trimWhiteSpace(Scanner scanner) throws DataValidationException
	{
		try
		{
			String  str = getInputString(scanner);
			System.out.println("STRING AFTER REMOVING WHITESPACES "+ taskObj.removeWhiteSpace(str));
		}
		catch ( DataValidationException e)
		{
			throw new DataValidationException("Exception thrown by runner class",e);
		}
	}		
}