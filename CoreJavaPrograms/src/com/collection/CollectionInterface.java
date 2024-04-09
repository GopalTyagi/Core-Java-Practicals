package com.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

public class CollectionInterface {
	public static void main(String[] args) {
		// List interface and its classes
		List l = new ArrayList();
		List l1 = new LinkedList();
		List l2 = new Vector();

		// Set interfaces and its classes
		Set s = new HashSet();
		Set s1 = new LinkedHashSet();

		// Queue interface and its classes
		Queue q = new ArrayDeque();
		Queue q1 = new PriorityQueue();

		// These methods are common in all collection interfaces
		List list = new ArrayList();
		list.add(12);
		list.add('a');
		list.add(true);
		list.add(false);
		list.add('b');
		list.add("gopal");
		// it will add elements in list
		System.out.println(list);// taking output

		for (Object obj : list) {
			// taking output using for each loop
			System.out.println(obj);

		}
		
		List a = new ArrayList();
		a.add('a');
		a.add('b');
		a.add("gopal");
		a.add('D');
		
		list.retainAll(a);
		//it will return the common elements
		System.out.println(list);
		
		list.addAll(a);
		//it will add all elements into list
		System.out.println(list);
		
		boolean b = list.containsAll(a);
		System.out.println(b);

	}

}
