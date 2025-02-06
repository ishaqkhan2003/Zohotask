package com.arraylist.task;
//import java.util.ArrayList;
import com.utility.Utility;
import java.util.List;
import java.util.Iterator;
import java.lang.reflect.Constructor;

import com.exceptionhandling.DataValidationException;
public class ArrayListTask {
		public <T> List<T> getArrayList(String string) throws Exception{
			Utility.checkNull(string);
			Class<?> clazz = Class.forName(string);
			Constructor<?>  constructor = clazz.getConstructor();
			List<T> newInstance = (List<T>) constructor.newInstance();
			return newInstance;
		}
		public <T> void createList( List<T> listOne,List<T> listTwo) throws DataValidationException{
			Utility.checkNull(listOne);
			Utility.checkNull(listTwo);
			listOne.addAll(listTwo);				
		}
		public <T> int getListSize(List<T> list) throws DataValidationException{
			Utility.checkNull(list);
			return list.size();
		}
		public <T> void addToList(List<T> list,T element) throws DataValidationException{
			Utility.checkNull(list);
			list.add(element);
		}
		public <T> void getSubList(List<T> listOne,List<T> listTwo,int fromIndex,int toIndex)throws DataValidationException{
			int length = getListSize(listOne);
			Utility.checkNull(listTwo);
			Utility.checkBoundary(length,fromIndex);
			Utility.checkBoundary(length,toIndex);
			listTwo.addAll(listOne.subList(fromIndex,toIndex));
		}
		public <T> int getIndexOf(List<T> list,T element) throws DataValidationException{
				Utility.checkNull(list);
				return list.indexOf(element);
		}
		public<T> int getLastIndexOf(List<T> list,T element) throws DataValidationException{
			Utility.checkNull(list);
			return list.lastIndexOf(element);
		}
		public <T> void insertToList(List<T> list,T element,int index)throws DataValidationException{
			Utility.checkBoundary(getListSize(list),index);
			list.add(index,element);
		}
		public <T> Iterator<T> getIterator(List<T> list){
			Iterator<T> iter = list.iterator();
			return  iter;
		}
		public <T> T getElementAt(List<T> list,int index) throws DataValidationException{
			Utility.checkBoundary(getListSize(list),index);
			return list.get(index);
		}
		public <T> void removeElementAt(List<T> list,int index) throws DataValidationException{
			Utility.checkBoundary(getListSize(list),index);
			list.remove(index);			
		}
		public <T> void removeAllFromList(List<T> listOne,List<T> listTwo)throws DataValidationException{
			Utility.checkNull(listOne);
			Utility.checkNull(listTwo);
			listOne.removeAll(listTwo);
		}
		public <T> void retainAllFromList(List<T> listOne,List<T> listTwo) throws DataValidationException{
			Utility.checkNull(listOne);
			Utility.checkNull(listTwo);
			listOne.retainAll(listTwo);			
		}
		public <T> void clearAll(List<T> list)throws DataValidationException{
			Utility.checkNull(list);
			list.clear();
		}
		public <T> boolean containsElement(List<T> list,T element)throws DataValidationException{
			Utility.checkNull(list);
			return list.contains(element);
		}
}