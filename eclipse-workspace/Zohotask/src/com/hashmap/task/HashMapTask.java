package com.hashmap.task;
import java.util.HashMap;
import com.exceptionhandling.DataValidationException;
import com.utility.Utility;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
public class HashMapTask{
	public <K,V>  Map<K,V> getHashMap(){
		return new HashMap<>();
	}
	public <K,V> int getMapSize(Map<K,V>  map)throws DataValidationException{
		return  Utility.getLength(map);
	}
	public <K,V> void putToMap(Map <K,V> map,K key,V value) throws DataValidationException{
		Utility.checkNull(map);
		map.put(key,value);
	}
	public <K,V> V replaceValue(Map<K,V> map,K key,V value) throws DataValidationException{
		Utility.checkNull(map);
		return map.replace(key,value);
	}
	public <K,V> boolean checkContainsKey(Map <K,V> map ,K key) throws DataValidationException{
		Utility.checkNull(map);
		return map.containsKey(key);
	}
	public <K,V> boolean checkContainsValue(Map<K,V> map,V value) throws DataValidationException{
		Utility.checkNull(map);
		return map.containsValue(value);
	}
	public <K,V> void replaceAllValue(Map<K,V> map,BiFunction< K,V, V> biFunction) throws DataValidationException{
		Utility.checkNull(map);
		map.replaceAll(biFunction);
	}
	public <K,V> V getValue(Map<K,V> map,K key) throws DataValidationException{
		Utility.checkNull(map);
		return map.get(key);
	}
	public <K,V>  V getValueOrDefault(Map<K,V> map,K key,V defaultValue) throws DataValidationException{
		Utility.checkNull(map);
		return map.getOrDefault(key,defaultValue);
	}
	public <K,V> V removeKey(Map<K,V> map,K key)throws DataValidationException{
		Utility.checkNull(map);
		return map.remove(key);
		
	}
	public <K,V> boolean removeKey(Map<K,V> map,K key,V value)throws DataValidationException{
		Utility.checkNull(map);
		return map.remove(key,value);
	}
	public <K,V> boolean replaceValue(Map<K,V> map,K key,V oldValue,V newValue)throws DataValidationException{
		Utility.checkNull(map);
		return map.replace(key,oldValue,newValue);
	}
	public <K,V> void putAllValue(Map<K,V> mapOne,Map<K,V> mapTwo) throws DataValidationException{
		Utility.checkNull(mapOne);
		Utility.checkNull(mapTwo);
		mapTwo.putAll(mapOne);
	}
	public <K,V> void forEachMap(Map<K,V> map ,BiConsumer< K,V> biConsumer) throws DataValidationException{
		Utility.checkNull(map);
		Utility.checkNull(biConsumer);
		map.forEach(biConsumer);
		
	}
	public <K,V> void clearAll(Map<K,V> map)throws DataValidationException{
		Utility.checkNull(map);
		map.clear();
	}
}





