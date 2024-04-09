package com.mycollection;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class BookLinkedHashSet {
	public static void main(String[] args) {
		
		//Elements are iterated in the same order in which they have added
		
		LinkedHashSet l = new LinkedHashSet();
		l.add("four");
		l.add("one");
		l.add("six");
		l.add("two");
		
		System.out.println(l);
		
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
