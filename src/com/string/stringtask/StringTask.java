package com.string.stringtask;
import java.util.*;
import com.exceptionhandling.DataValidationException;
import com.utility.Utility;
public class StringTask { 
	public int getLength(String string) throws DataValidationException{
		Utility.checkNull(string);
		return Utility.getLength(string);	
	}

	public char[] toCharacterArray(String string) throws DataValidationException{
		Utility.checkNull(string);
		return string.toCharArray();	
	}
	public char getCharFromLast(String string,int positionOfChar) throws DataValidationException{  	
		int stringLength = Utility.getLength(string);
		if ( stringLength == 0)
		{
			throw new DataValidationException("The given string is empty.");
		}
		Utility.checkBoundary(stringLength,positionOfChar);
		return string.charAt(stringLength - positionOfChar);
		
	}
	public int numberOfOccurance(String string , char character) throws DataValidationException{
		int stringLength = Utility.getLength(string);
		if ( stringLength == 0)
		{
			throw new DataValidationException("The given string is empty.");
		}
		int total = 0;
		for ( int i = 0 ; i<stringLength;i++)
		{
			if ( string.charAt(i) == character )
			{
				total++;
			}
		}
		return total;
		 
	}

	public int getGreatestPosition(String string,char character) throws DataValidationException{
		Utility.checkNull(string);
		return string.lastIndexOf(character);
	}
	public String getLastCharacters(String string,int noOfChar) throws DataValidationException{
		int stringLength = Utility.getLength(string);
		Utility.checkBoundary(stringLength,noOfChar);
		return string.substring((stringLength - noOfChar));
	}
	public String getFirstCharacters(String string,int noOfChar) throws DataValidationException{
		int stringLength = Utility.getLength(string);
		Utility.checkBoundary(stringLength,noOfChar);
		return string.substring(0,noOfChar);
	}
	public String replaceFromPrefix(String string,String replacementString,int noOfChar) throws DataValidationException{
		int stringLength = Utility.getLength(string);
		Utility.checkBoundary(stringLength,noOfChar);
		Utility.checkNull(replacementString);
		return string.replaceFirst(getFirstCharacters(string,noOfChar),replacementString);
	}
	public String replaceFromSuffix(String string,String replacementString,int noOfChar) throws DataValidationException{
		int stringLength = Utility.getLength(string);
		Utility.checkBoundary(stringLength,noOfChar);
		Utility.checkNull(replacementString);
		return getFirstCharacters(string , getLength(string)-noOfChar)+replacementString;
	}
	public String replaceFromAnyIndex(String string,String replacementString,int noOfChar,int index) throws DataValidationException{
		int stringLength = Utility.getLength(string);
		Utility.checkBoundary(stringLength,noOfChar);
		Utility.checkNull(replacementString);
		return string.replace(string.substring(index,noOfChar+index),replacementString);
	}		
	public boolean checkStartsWith(String string,String startingWith) throws DataValidationException{
		Utility.checkNull(string);
		Utility.checkNull(startingWith);
		return string.startsWith(startingWith);	
	}
	public boolean checkEndsWith(String string,String endingString) throws DataValidationException {
		Utility.checkNull(string);
		Utility.checkNull(endingString);
		return string.endsWith(endingString);
	}
	public String toLowerCasedString(String string) throws DataValidationException {
		Utility.checkNull(string);
		return string.toLowerCase();
	}
	public String toUpperCasedString(String string) throws DataValidationException {
		Utility.checkNull(string);
		return string.toUpperCase();
	}
	public String toReverseString(String string) throws DataValidationException {
		int inputstringLength = Utility.getLength(string);
		char[] inputCharArray = toCharacterArray(string);
		char[] reverseCharArray = new char[inputstringLength];
		int j = inputstringLength-1;
		for ( int i = 0 ;i<inputstringLength;i++)
		{
			reverseCharArray[j] = inputCharArray[i];
			j--;
		}
		return new String(reverseCharArray);		
	}
	public String getMultipleString(String string ) throws DataValidationException{
		Utility.checkNull(string);
		return string;
	}

	public String[] toConvertStringArray(String string,String delimittingCharacter) throws DataValidationException{
		Utility.checkNull(string);
		return string.split(delimittingCharacter);
	}
	public String concatStrings( List<String> stringArray, String sepCharacter) throws DataValidationException{
		int sizeOfArray = stringArray.size();
		if ( sizeOfArray == 0 )
		{
			 throw new DataValidationException("INVALID INPUT ");
		}
		return String.join(sepCharacter,stringArray);

	}
	public int compareCaseSensitiveStrings(String  strOne, String strTwo) throws DataValidationException{
		Utility.checkNull(strOne);
		Utility.checkNull(strTwo);
		return strOne.compareTo(strTwo);
	}
	public String changeDelimitter(String string,String oldDelimittingChar,String newDelimittingChar) throws DataValidationException{
		Utility.checkNull(string);
		return string.replaceAll(oldDelimittingChar,newDelimittingChar);
	}
	public int compareCaseInSensitiveStrings(String  strOne, String strTwo) throws DataValidationException{
		Utility.checkNull(strOne);
		Utility.checkNull(strTwo);
		return strOne.compareToIgnoreCase(strTwo);
	}
	public String removeWhiteSpace(String string) throws DataValidationException{
		Utility.checkNull(string);
		return string.trim();
	}
}