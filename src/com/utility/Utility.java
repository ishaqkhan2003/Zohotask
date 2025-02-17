package com.utility ;
import com.exceptionhandling.DataValidationException;
import java.util.List;

import java.util.Scanner;
import java.util.Map;
public  class Utility {
	static Scanner scanner = new Scanner(System.in);
	public static void checkNull(Object obj) throws DataValidationException{
		if ( obj == null )
		{
			throw new DataValidationException("The input string is null.");
		}
	}
	public static void checkBoundary(int length,int index) throws DataValidationException{
		if ( length < index || index < 0)
		{
			throw new DataValidationException("Out of Index ");
		}
	}
	
	public static <T> int getLength(List<T> list) throws DataValidationException{
		checkNull(list);
		return list.size();
	}
	
	public static <K,V>int getLength(Map<K,V> map) throws DataValidationException{
		checkNull(map);
		return map.size();
	}
	public static int getLength(String string) throws DataValidationException{
		checkNull(string);
		return string.length();
	}
	public static int getLength(StringBuilder string) throws DataValidationException{
		checkNull(string);
		return string.length();
	}
	public static int getLength(String[] strArray)throws DataValidationException{
		checkNull(strArray);
		return strArray.length;
	}
	public static int getIntInput(){
		
		int integer = scanner.nextInt();
		scanner.nextLine();
		return integer;
	}
	public static String getStrInput(){
		return scanner.nextLine();
	}
	public static float getFloatInput(){
		float floatValue = scanner.nextFloat();
		scanner.nextLine();
		return floatValue;
	}
	public static long getLongInput(){
		long longValue = scanner.nextLong();
		scanner.nextLine();
		return longValue;
	}

}