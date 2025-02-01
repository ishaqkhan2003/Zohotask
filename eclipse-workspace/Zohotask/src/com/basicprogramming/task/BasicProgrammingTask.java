package com.basicprogramming.task;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import com.exceptionhandling.DataValidationException;
import com.utility.Utility;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BasicProgrammingTask {
	public BufferedReader getBufferedReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}
	public BufferedReader getBufferedReader(String pathname)throws DataValidationException,FileNotFoundException{
		Utility.checkNull(pathname);
		return new BufferedReader(new FileReader(pathname));
	}
	public BufferedWriter getBufferedWriter(String path)throws DataValidationException,IOException {
		return new BufferedWriter(new FileWriter(path));
	}
	public BufferedWriter getBufferedWriter(String path,boolean bool)throws DataValidationException,IOException {
		return new BufferedWriter(new FileWriter(path,bool));
	}
	public File getFile(String path) throws DataValidationException{
		Utility.checkNull(path);
		return new File(path);
	}
	public boolean checkIsDirectory(String string)throws DataValidationException{
		
		return getFile(string).isDirectory();
	}
	public boolean checkIsDirectory(String string,boolean bool)throws DataValidationException{
		File file = getFile(string);
		boolean check = true;
		if( !file.isDirectory()) {
			return makeDirs(file, string);
		}
		return check;
	}
	public boolean makeDirs(File file,String string) {
		return file.mkdirs();
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
