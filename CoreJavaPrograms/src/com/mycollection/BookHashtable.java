package com.mycollection;


import java.util.Hashtable;

public class BookHashtable {

	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		map.put(1, "gopal");
		map.put(2, "krishna");
		map.put(3, "mangal");
		map.put(4, "shiv");
	
		map.hashCode();
		System.out.println(map);
	}
}
