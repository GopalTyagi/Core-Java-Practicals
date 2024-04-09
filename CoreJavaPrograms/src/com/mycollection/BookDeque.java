package com.mycollection;


import java.util.ArrayDeque;
import java.util.Deque;

public class BookDeque {
	public static void main(String[] args) {
		Deque d = new ArrayDeque();
		d.add("one");
		d.add("two");
		d.add("three");
		d.addFirst("zero");
		d.addLast("prarambh");
		System.out.println(d);
		
		Object o = d.element();
		System.out.println(o);
	
		//remove top element
		Object o1 = d.remove();
		System.out.println(o1);
		System.out.println(d);
		
		//remove top element
		Object o2 = d.removeFirst();
		System.out.println(o2);
		System.out.println(d);
		
		//remove bottom element
		Object o3 = d.removeLast();
		System.out.println(o3);
		System.out.println(d);
	
	}

}
