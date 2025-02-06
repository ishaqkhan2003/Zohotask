package com.hashmap.runner;
import com.utility.Utility;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import com.hashmap.task.HashMapTask;
import com.customeobject.CustomeObject;
import com.exceptionhandling.DataValidationException;
public class HashMapRunner{
	HashMapTask taskObj = new HashMapTask();
	public static void main(String[] args){
		HashMapRunner runnerObj = new HashMapRunner();
		boolean bool=true;
		int choice;
		runnerObj.showTask();
		while(bool){
			try{
			
			System.out.print("Enter Task Number ");
			choice = Utility.getIntInput();
			switch(choice){
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
						runnerObj.operationNineteen();
						break;
				case 20:
						runnerObj.operationTwenty();
						break;
				case 21:
						bool =  false;
						break;
				case 22:
						runnerObj.showTask();
						break;
				default :
						System.out.println("Enter a valid choice ");
						break;
			}
			}
			catch ( DataValidationException e){
				e.printStackTrace();
			}
		}
	}
	public void showTask() {
		System.out.println("The task are ");
		System.out.println("1. Create a HashMap and print it");
		System.out.println("2. Create a HashMap with key and value as String ");
		System.out.println("3. Create a HashMap with key and value as Integer ");
		System.out.println("4. Create a HashMap with key as String and value as Integer ");
		System.out.println("5. Create a HashMap with key as String and value as own object");
		System.out.println("6. Create a HashMap with keys(String). With a null value to one of the keys.");
		System.out.println("7. Create a HashMap & add a null key & non null value to it");
		System.out.println("8. Program to check a key exists in a HashMap");
		System.out.println("9. Program to check a value exists in a HashMap");
		System.out.println("10. Create a HashMap and change its value for keys");
		System.out.println("11. Program to get the value of a existing key in a HashMap ");
		System.out.println("12. Program to get the value of a non existing key in a HashMap ");
		System.out.println("13. Program to return “Zoho” as a value for a given non existing key ");
		System.out.println("14. Program to remove an existing key in a HashMap.");
		System.out.println("15. Program to remove an existing key only if it’s value matches with the given value ");
		System.out.println("16. Program to replace the value of an existing key in a HashMap");
		System.out.println("17. Program to replace the value of an existing key only if it’s value matches with the given value");
		System.out.println("18. program to transfer all the keys & values of a HashMap to another HashMap keys & values already");
		System.out.println("19. Program to iterate over a HashMap & print all it’s key & its corresponding value.");
		System.out.println("20. Program to remove all entries in a HashMap ");
		System.out.println("21. Exit");
		System.out.println("22. Show Task");
		
	}
	public void operationOne()throws DataValidationException{
		try{
		Map<Integer,String> newHashMap = taskObj.getHashMap();
		printHashMap(newHashMap);
		printHashMapSize(newHashMap);
		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
		
	}
	public void operationTwo() throws DataValidationException	 {
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
 		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationThree() throws DataValidationException	 {
		try{
			Map<Integer,Integer> newHashMap = taskObj.getHashMap();
			System.out.print("Enter number of pairs to add  ");
			int noOfPair = Utility.getIntInput(),i,key,value;
			for (i=0;i<noOfPair;i++){
				System.out.print("Enter key  (Integer)");
				key = Utility.getIntInput();
				System.out.print("Enter  value (Integer)");
				value = Utility.getIntInput();
				taskObj.putToMap(newHashMap,key,value);
			}
		printHashMap(newHashMap);
		printHashMapSize(newHashMap);
 		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationFour() throws DataValidationException{
		try{
			Map<String,Integer> newHashMap = taskObj.getHashMap();
			System.out.print("Enter number of pairs to add  ");
			int noOfPair = Utility.getIntInput(),i,value;
			String key;
			for (i=0;i<noOfPair;i++){
				System.out.print("Enter key  (String)");
				key = Utility.getStrInput();
				System.out.print("Enter  value (Integer)");
				value = Utility.getIntInput();
				taskObj.putToMap(newHashMap,key,value);
			}
		printHashMap(newHashMap);
		printHashMapSize(newHashMap);
			
		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationFive() throws DataValidationException{
		try{
			Map<Integer,CustomeObject> newHashMap = taskObj.getHashMap();
			System.out.print("Enter number of pairs to add ");
			int noOfPair = Utility.getIntInput(),i,key;
			for(i = 0;i<noOfPair;i++){
				System.out.print("Enter key  (Integer)");
				key = Utility.getIntInput();
				taskObj.putToMap(newHashMap,key,new CustomeObject("customeObj_"+(i+1)));
				
			}
		printHashMap(newHashMap);
		printHashMapSize(newHashMap);
			
		}
		catch(DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationSix() throws DataValidationException{
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.print("Enter key whose value need to be null ");
			String nullKey = Utility.getStrInput();
			if ( taskObj.replaceValue(newHashMap,nullKey,null)==  null){
				System.out.println("The given key is not present ");
			}
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);
			
		}
		catch(DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationSeven() throws DataValidationException{
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.println("Making a key as null And Adding a non null value for it ");
			taskObj.putToMap(newHashMap,null,"Non Null valur");
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);			
		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationEight() throws DataValidationException{
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.print("Enter a key to check if it exist in HasMap ");
			String checkKey = Utility.getStrInput();
			if( taskObj.checkContainsKey(newHashMap,checkKey)){
				System.out.println("The given key is present ");
			}
			else{
				System.out.println("The given key is not present ");
			}
		}
		catch( DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationNine() throws DataValidationException{
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.print("Enter a value to check if it exist in HasMap ");
			String checkValue = Utility.getStrInput();
			if( taskObj.checkContainsValue(newHashMap,checkValue)){
				System.out.println("The given value is present ");
			}
			else{
				System.out.println("The given value is not present ");
			}
		}
		catch ( DataValidationException e){
			e.printStackTrace();
		}
	} 	
	public void operationTen() throws DataValidationException{
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			
			BiFunction<String,String,String> biFunction = (key,value)->{System.out.print("Enter new value  for key - "+key);
																		value = Utility.getStrInput();
																		return value;};
			taskObj.replaceAllValue(newHashMap,biFunction);
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);	
			
		}
		catch (DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationEleven() throws DataValidationException{
		try{
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.print("Enter key to fetch vaue ");
			String key = Utility.getStrInput();
			String value = taskObj.getValue(newHashMap,key);
			if ( value ==  null){
				System.out.println("The key doesnt exist ");
			}
			System.out.println("The value is "+value);
		}
		catch (DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationTwelve() throws DataValidationException{
		try{			
			operationEleven();
		}
		catch(DataValidationException e){
			e.printStackTrace();
		}
	}
	public void operationThirteen() throws DataValidationException {
		try {
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			printHashMapSize(newHashMap);
			System.out.print("Enter a non existing key ");
			String nonExistKey = Utility.getStrInput();
			System.out.print("Enter default value for non existing key ");
			String defaultValue = Utility.getStrInput();
			System.out.println("The  value is "+taskObj.getValueOrDefault(newHashMap,nonExistKey,defaultValue)); 
			System.out.println("Hash Map after change is ");
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);	
			
		}
		catch(DataValidationException e) {
			e.printStackTrace();
		}
	}
	public void operationFourteen() throws DataValidationException {
		try {
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.print("Enter  key to remove ");
			String delKey = Utility.getStrInput();
			if (taskObj.removeKey(newHashMap, delKey)==null) {
				System.out.println("The key dosnt exist ");
			}
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);
			
		}
		catch(DataValidationException e) {
			e.printStackTrace();
		}
	}
	public void operationFifteen() {
		try {
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.print("Enter key to remove ");
			String key = Utility.getStrInput();
			System.out.print("Enter keys's value to remove ");
			String value = Utility.getStrInput();
			if(taskObj.removeKey(newHashMap, key, value)) {
				System.out.println("The key is removed ");
			}
			else {
				System.out.println("The key value pair is not present ");
				
			}
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);
		}
		catch(DataValidationException e) {
			e.printStackTrace();
		}
	}
	
	public void operationSixteen() throws DataValidationException{
		try {
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.print("Enter key to replace ");
			String key = Utility.getStrInput();
			System.out.print("Enter new value to replace ");
			String newValue = Utility.getStrInput();
			if (taskObj.replaceValue(newHashMap, key, newValue)==null) {
				System.out.println("The given key is not present");
			}
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);
			
			
		}
		catch(DataValidationException e) {
			e.printStackTrace();
		}
	}
	public void operationSeventeen()throws DataValidationException{
		try {
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			System.out.print("Enter key to replace ");
			String key = Utility.getStrInput();
			System.out.print("Enter old value of key ");
			String oldValue = Utility.getStrInput();
			System.out.print("Enter new value to replace ");
			String newValue = Utility.getStrInput();
			if(!taskObj.replaceValue(newHashMap, key, oldValue, newValue)) {
				System.out.println("The given key value pair not exist ");
			}
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);
			
		}
		catch(DataValidationException e) {
			e.printStackTrace();
		}
		
	}
	public void operationEighteen() throws DataValidationException{
		try {
			Map<String,String> hashMapOne = taskObj.getHashMap();
			System.out.println("Enter value for map 1");
			addStrToHashMap(hashMapOne);
			Map<String,String> hashMapTwo = taskObj.getHashMap();
			System.out.println("Enter value for map 2");
			addStrToHashMap(hashMapTwo);
			taskObj.putAllValue(hashMapOne,hashMapTwo);
			System.out.println("HashMap 1 after change");
			printHashMap(hashMapOne);
			printHashMapSize(hashMapOne);
			System.out.println("HashMap 2 after change");
			printHashMap(hashMapTwo);
			printHashMapSize(hashMapTwo);
		}
		catch(DataValidationException e) {
			e.printStackTrace();
		}
	}
	public void operationNineteen() throws DataValidationException{
		try {
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			BiConsumer<String,String> biConsumer = (key,value)-> {System.out.println("The key is "+key+"and its value is "+value);};
			taskObj.forEachMap(newHashMap, biConsumer);
		}
		catch(DataValidationException e) {
			e.printStackTrace();
		}
	}
	public void operationTwenty() throws DataValidationException{
		try {
			Map<String,String> newHashMap = taskObj.getHashMap();
			addStrToHashMap(newHashMap);
			taskObj.clearAll(newHashMap);
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);
		}
		catch(DataValidationException e) {
			e.printStackTrace();
		}
	}
	public <K,V> void printHashMap(Map<K,V> hashMap) throws DataValidationException{
		Utility.checkNull(hashMap);
		System.out.println("The hash map is - "+hashMap);		
	}
	public <K,V> void printHashMapSize(Map<K,V> hashMap) throws DataValidationException{
		Utility.checkNull(hashMap);
		System.out.println("The size of Hash Map is "+taskObj.getMapSize(hashMap));
	}
	public  void addStrToHashMap(Map<String,String>  newHashMap) throws DataValidationException{
		Utility.checkNull(newHashMap);
			System.out.print("Enter number of pairs to add  ");
			int noOfPair = Utility.getIntInput(),i;
			String key,value;
			for (i=0;i<noOfPair;i++){
				System.out.print("Enter key  (String)");
				key = Utility.getStrInput();
				System.out.print("Enter  value (String)");
				value = Utility.getStrInput();
				taskObj.putToMap(newHashMap,key,value);
			}
			System.out.println("The Orginal HashMap is ");
			printHashMap(newHashMap);
			printHashMapSize(newHashMap);
		
	}

}