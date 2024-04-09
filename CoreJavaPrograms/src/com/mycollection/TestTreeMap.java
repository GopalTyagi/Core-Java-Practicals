package com.mycollection;

import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(9, "nine"); // it will sort in Asce order
		t.put(6, "six");
		t.put(3, "three");
		t.put(4, "four");
		t.put(5, "five");

		System.out.println(t);
		
		System.out.println(t.containsKey(9)); // it will return boolean value
		
		System.out.println(t.containsValue("nine")); // it will return bolean value
		
		System.out.println(t.firstKey()); // it will check first key by output asceding order
		
		System.out.println(t.get(6)); // it will return value of given key
		
		System.out.println(t.lastKey()); // it will check last key by output asceding order
		
		System.out.println(t.remove(9)); // it remove the key and return value nine
		
		System.out.println(t.size()); // it return size
		
		System.out.println(t.entrySet()); // it return key-value pair
		
		System.out.println(t.lastEntry()); // it return last key-value pair of output not putted elements
			
	    System.out.println(t.firstEntry()); // it return first key-value pair of output not putted elements
		
	    System.out.println(t.keySet()); // it only return the keys
		
	    System.out.println(t);

	}

}
