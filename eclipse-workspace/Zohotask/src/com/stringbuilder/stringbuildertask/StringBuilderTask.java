package com.stringbuilder.stringbuildertask;
import com.exceptionhandling.DataValidationException;
import com.utility.Utility;
public class StringBuilderTask{
	public StringBuilder getStrBuilder(){
		return new StringBuilder();
	}
	public StringBuilder getStrBuilder(String str) {
		return new StringBuilder(str);
	}
	public StringBuilder getStrBuilder(String[] strArray,String delimitingChar) throws DataValidationException{
		StringBuilder strBuilder = getStrBuilder();
		strBuilder = appendToStrBuilder(strBuilder,strArray,delimitingChar);
		return strBuilder;
	}
	public StringBuilder appendToStrBuilder(StringBuilder strBuilder,String[]  strArray) throws DataValidationException {
		return appendToStrBuilder(strBuilder,strArray,"");
	}
	public StringBuilder appendToStrBuilder(StringBuilder strBuilder,String[]  strArray,String delimitingChar) throws DataValidationException{
		int lengthOfStrBuilder = Utility.getLength(strBuilder);
		if ( lengthOfStrBuilder != 0){
			strBuilder.append(delimitingChar);
		}
		int sizeOfArray = Utility.getLength(strArray);
		for (int i = 0;i< sizeOfArray;i++){
			if (i<(sizeOfArray-1)){
				strBuilder.append(strArray[i] + delimitingChar);
			}
			else{
				strBuilder.append(strArray[i]);
			}
			
		}
		return strBuilder;
	}
	public int getLastIndexOf(StringBuilder strBuilder,String str) throws DataValidationException{
		Utility.checkNull(strBuilder);
		return strBuilder.lastIndexOf(str);
	}
	public int getFirstIndexOfStr(StringBuilder strBuilder,String str) throws DataValidationException
	{
		Utility.checkNull(strBuilder);
		return strBuilder.indexOf(str);
	}
	public StringBuilder insertToStrBuilder(StringBuilder strBuilder,String string,String delimiter,int index) throws DataValidationException
	{
		int lengthOfStrBuilder = Utility.getLength(strBuilder);
		Utility.checkBoundary(lengthOfStrBuilder,index+1);
		if ( index == 1){
			return strBuilder.insert(0,string+delimiter);
		}
		else if ( index == lengthOfStrBuilder ){
			return strBuilder.insert(index-1,string+delimiter);
		}
		else{
			
		return strBuilder.insert(getCustomIndexOf(strBuilder,delimiter,index-1),delimiter+string);
		}
	}
	public StringBuilder delFromStrBuilder(StringBuilder strBuilder,int start,int end)throws DataValidationException{
		Utility.checkNull(strBuilder);
		return strBuilder.delete(start,end);
	}
	public int getCustomIndexOf(StringBuilder strBuilder, String delimiter, int position) throws DataValidationException{
		int index = 0;
		int fromIndex = 0;    
		for (int i=0; i<position; i++)
		{
			index = strBuilder.indexOf(delimiter, fromIndex);
			fromIndex = index+1;
		} 
		return index;
	}
		
	public StringBuilder delFromStrBuilder(StringBuilder strBuilder,int position,String delimiter) throws DataValidationException
	{
		int lengthOfStrBuilder = Utility.getLength(strBuilder);
		Utility.checkBoundary(lengthOfStrBuilder,position);
		int start = getCustomIndexOf(strBuilder,delimiter,position-1);
		int end = getCustomIndexOf(strBuilder,delimiter,position);
		return delFromStrBuilder(strBuilder,start,end);
	}
	public StringBuilder replaceStringInStrBuilder(StringBuilder strBuilder,String oldDelimiter,String newDelimiter) throws DataValidationException
	{
		Utility.checkNull(strBuilder);
		int index,length = Utility.getLength(oldDelimiter);
		while (true){			
			index = getFirstIndexOfStr(strBuilder,oldDelimiter);
			if ( index == -1){
				break ;
			}
			strBuilder.replace(index,index+length,newDelimiter);			
		}
		return strBuilder;
	}
	public StringBuilder reverseStrBuilder(StringBuilder strBuilder) throws DataValidationException	{
		Utility.checkNull(strBuilder);
		return strBuilder.reverse();
	}
	public StringBuilder replaceStringInStrBuilder(StringBuilder strBuilder,int start,int end,String str) throws DataValidationException{
		int lengthOfStrBuilder = Utility.getLength(strBuilder);
		Utility.checkBoundary(lengthOfStrBuilder,start);
		Utility.checkBoundary(lengthOfStrBuilder,end);
		return strBuilder.replace(start,end,str);
	}		
}		