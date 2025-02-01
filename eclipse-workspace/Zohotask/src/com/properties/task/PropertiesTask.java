package com.properties.task;
import java.util.Properties;
import java.util.Set;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedReader;
import com.utility.Utility;
import com.exceptionhandling.DataValidationException;


public class PropertiesTask {
	public Properties getProperties() {
		return new Properties();
	}
	public Object setToProperty(Properties property,String key,String value) throws DataValidationException{
		
		Utility.checkNull(property);
		return property.setProperty(key, value);
	}
	public void storeToFile(Properties property,BufferedWriter bWriter,String comments) throws DataValidationException,IOException{
		Utility.checkNull(comments);
		Utility.checkNull(property);
		Utility.checkNull(bWriter);
		property.store(bWriter, comments);
	}
	public void loadFile(Properties property,BufferedReader reader)throws DataValidationException, IOException,IllegalArgumentException{
		Utility.checkNull(reader);
		property.load(reader);
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
	 
}
