package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("101");
		c.add("gopal");
		c.add("tyagi");
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
