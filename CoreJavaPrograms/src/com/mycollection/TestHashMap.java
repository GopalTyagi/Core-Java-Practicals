package com.mycollection;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(10, "gopal"); // if key-value is same than it will print only one
		m.put(20, "jay"); // it will accept only one null key
		m.put(3, "mangal"); // it will accept many null values
		m.put(4, "vashu");
		m.put(5, "krishna");

		System.out.println(m);
		
		System.out.println(m.containsKey(2)); // it return boolean value (T/F)
		
		System.out.println(m.containsValue("vashu")); // it return boolean value(T/F)
		
		System.out.println(m.get(20)); // if doesn't exist return null and exist than return value
		
		System.out.println(m.hashCode()); // return hascode value
		
		System.out.println(m.isEmpty()); // return boolean value false
		
		System.out.println(m.remove(5)); // it return value of given key
		
		System.out.println(m.replace(3, "Pradeep")); // it return old value and replace the old
		
		System.out.println(m);
		
		System.out.println(m.size()); // it return the element size
		
		System.out.println(m.entrySet()); // it return key-value pair
		
		System.out.println(m.keySet()); // it return only keys
		
		System.out.println(m.values()); // it will return only values
		
		Map m1 = (Map) m.clone(); // it will clone the elements
		System.out.println(m1);

	}

}
