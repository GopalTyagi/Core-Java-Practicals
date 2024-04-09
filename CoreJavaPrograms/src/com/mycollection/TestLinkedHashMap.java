package com.mycollection;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap l = new LinkedHashMap();
		l.put(10, "ram");
		l.put(2, "shyam");
		l.put(3, "lakhan");
		l.put(4, "om");
		l.put(5, "jay");
		System.out.println(l);

		System.out.println(l.containsValue("ram")); // it check value and return boolean (T/F)
		
		System.out.println(l.get(5)); // it return value of given key
		
		System.out.println(l.entrySet()); // it return key-value pair

		
		System.out.println(l.keySet()); // it return only keys
		
		System.out.println(l.values()); // it return only values

	}

}
