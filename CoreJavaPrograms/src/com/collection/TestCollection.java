package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		
		// create a collection
		Collection c = new ArrayList();
		
		// add elements into collection
		c.add(101);
		c.add("gopal");
		c.add("tygai");
		
		//System.out.println(c.size());
		//System.out.println(c);
		
		for (Object ele : c) {
			System.out.println(ele);
		}
		
		//convert collection into array
		c.toArray();
		System.out.println(c);
	}

}
