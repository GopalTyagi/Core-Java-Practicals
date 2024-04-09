package com.mycollection;

import java.util.Hashtable;

public class TestHashtable {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(2, "two");  //it arrange in desc order by key
		h.put(1, "one");
		h.put(4, "four");
		h.put(3, "three");
		h.put(6, "six");
		
		System.out.println(h);
		
		System.out.println(h.contains("one"));
		
		System.out.println(h.containsKey(1));
		
		System.out.println(h.containsValue("six"));
		
		System.out.println(h.get(2));
		
		System.out.println(h.hashCode());
		
		System.out.println(h.isEmpty());
		
		System.out.println(h.remove(2));
		
		System.out.println(h.size());
		
		System.out.println(h.entrySet());
		
		System.out.println(h.keySet());
		
		System.out.println(h.values());
	}

}
