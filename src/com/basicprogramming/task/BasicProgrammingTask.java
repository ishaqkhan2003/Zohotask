package com.basicprogramming.task;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.exceptionhandling.DataValidationException;
import com.utility.Utility;

public class BasicProgrammingTask {

	public void writeToFile(String filePath,String fileName,String[] string)throws Exception {
		if(makeNewDirectory(filePath)) {
			File file = new File(filePath,fileName);		
			try(BufferedWriter bWriter =new BufferedWriter(new FileWriter(file))){			
				int length =Utility.getLength(string),i;
				for(i=0;i<length;i++) {
					bWriter.write(string[i]);
					bWriter.newLine();
			}
			}
		}
		else {
			throw new DataValidationException("Error in Filepath ");
		}
	}
	public Properties getProperties() {
		return new Properties();
	}
	public Object setToProperty(Properties property,String key,String value) throws DataValidationException{		
		Utility.checkNull(property);
		return property.setProperty(key, value);
	}
	public void storeProperty(Properties property,String filePath,String fileName,String comments)throws DataValidationException, IOException {
		Utility.checkNull(comments);
		if(makeNewDirectory(filePath)) {
			File file = new  File(filePath,fileName);
			try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(file))){
				property.store(bWriter, comments);
			}
		}
		else {
			throw new DataValidationException("Error in Filepath ");
		}
	
	}
	public Properties loadProperty(String filePath,String fileName)throws DataValidationException, FileNotFoundException, IOException {
		
		Utility.checkNull(filePath);
		Utility.checkNull(fileName);
		Properties property = getProperties();
		if(makeNewDirectory(filePath)) {
			File file = new File(filePath,fileName);
			try(BufferedReader bReader = new BufferedReader(new FileReader(file))){
				property.load(bReader);
				
			}
		}
		else {
			throw new DataValidationException("Error in Filepath ");
		}
		return property;
	}
	public Set<String> getStringPropertyName(Properties property)throws DataValidationException{
		Utility.checkNull(property);
		return property.stringPropertyNames();
		
	}
	public String getValue(Properties property,String key)throws DataValidationException {
		Utility.checkNull(key);
		Utility.checkNull(property);
		return property.getProperty(key);
	}
	public File getFile(String string)throws DataValidationException{
		Utility.checkNull(string);
		return new File(string);
	}

	
	public boolean checkIsDirectory(String string)throws DataValidationException{
		
		return getFile(string).isDirectory();
	}
	public boolean makeNewDirectory(String string)throws DataValidationException{
		File file = getFile(string);
		boolean check = false;
		if( file.exists()) {
			if(file.isDirectory()) {
				check =  true;
			}
			else {
				check =false;
			}
		}
		else {
			check =file.mkdirs();
		}
		return check;
	}

	public boolean checkIsFile(String path)throws DataValidationException{
		Utility.checkNull(path);
		File file = getFile(path);
		return file.isFile();
	}
	public boolean generateNewFile(File file)throws DataValidationException,IOException{
		Utility.checkNull(file);
		return file.createNewFile();
	}
	public void writeToBufferedWriter(BufferedWriter writer,String string)throws DataValidationException, IOException{
		Utility.checkNull(string);
		writer.write(string);
		writer.newLine();
		
	}
	
	
}
