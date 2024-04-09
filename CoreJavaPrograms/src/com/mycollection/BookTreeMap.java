package com.mycollection;


import java.util.TreeMap;

public class BookTreeMap {
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(10, "gopal");
		t.put(2, "krishna");
		t.put(3, "mangal");
		t.put(4, "shiv");
	
		System.out.println(t);
		
		//print all key and value pairs
	for(Object o :t.keySet()) {
		System.out.println(o + " = "+t.get(o));
	}
		
	}

}
