package com.mycollection;


import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class BookHashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("10", "Gopal"); //in Asce order by key
		map.put("2", "krishna");
		map.put("3", "Mangal");
		map.put("4", "Harendra");
		
		System.out.println(map);
		
		int size = map.size();  //get size of map
		System.out.println(size);
		
		String val = (String)map.get("3");  //get value
		System.out.println(val);
		
		//remove by key
		System.out.println(map.remove("3"));
		System.out.println(map);
		
		//check by key
		boolean flag = map.containsKey("1");
		System.out.println(flag);
		
		//check by value
		boolean flag1 = map.containsValue("Gopal");
		System.out.println(flag1);

		//get keys
		Set keys = map.keySet();
		System.out.println(keys);
		for(Object o:keys) {
			System.out.println(o);
		}
		
		//get values
		Collection values = map.values();
		System.out.println(values);
		
		//get k-v pair
		Set keyval = map.entrySet();
		System.out.println(keyval);
	}

}
