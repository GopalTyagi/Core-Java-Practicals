package com.mycollection;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BookHashMapTest {
	public static void main(String[] args) {
		HashMap map  = new HashMap();
		map.put(null, "Zero");
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		map.put("4", "four");
	
		System.out.println(map);
		
		//get a value by key
		String val = (String)map.get("1");
		System.out.println(val);
		
		//remove an element by key
		map.remove("4");
		System.out.println(map);
		
		//get collection of keys and print
		Set keys = map.keySet();
		for(Object o : keys) {
			System.out.println(o);
		}
		
		//get collection of values and print
		Collection value = map.values();
		for(Object o1: value) {
			System.out.println(o1);
		}
		
		//print all key and value pairs
		Set keyval = map.entrySet();
		for(Object o2: keyval) {
			Map.Entry pair = (Map.Entry)o2;
			System.out.println(pair.getKey()+"-"+pair.getValue());
		}
	}

}
