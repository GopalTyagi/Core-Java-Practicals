package com.mycollection;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class BookPriorityQueue {
	public static void main(String[] args) {
		Queue q = new PriorityQueue();
		q.add("one");
		q.add("two");
		q.add("three");
		System.out.println(q);
		
		//Examine top element
		Object o = q.element();
		System.out.println(o);
		
		//Remove an element
		Object ele = q.remove();
		System.out.println(ele);
		System.out.println(q);
		
		//Access via Iterator
		Iterator it = q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
