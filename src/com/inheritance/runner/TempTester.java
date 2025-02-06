package com.inheritance.runner;

import java.util.HashMap;
import java.util.Map;

import com.hashmap.task.HashMapTask;

public class TempTester {
	public static void main(String[] args) {
//		HashMapTask hashMap = new HashMapTask();
		Map<String,String> hm = new HashMap<String, String>();
				hm.put("key1", null);
				System.out.println( hm.containsKey("key1"));
				System.out.println(hm.get("key2"));
		
	}
}
