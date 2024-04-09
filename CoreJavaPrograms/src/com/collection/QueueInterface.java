package com.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.offer(232);
		q.offer("gopal");
		q.offer(12);
		q.offer(1.2);

		System.out.println(q);

		
		//peek reterives only
		System.out.println(q.peek());
		// remove only one element
	//	System.out.println(q.remove());
	//	System.out.println(q);

		// poll method reterives and remove
		System.out.println(q.poll());
		System.out.println(q.poll());
		// main difference between poll and remove method is
		// remove method gives exception if queue is empty 
		// whereas poll method gives null value if queue is empty
		System.out.println(q);

		
		// methods of ArrayPriorityQueue class
		Queue q1 = new PriorityQueue();

		// Only simliar datatype value can be inserted

		q1.add(123);
		q1.add(40);
		q1.add(132);
		q1.add(45);
		System.out.println(q1);

		Queue a = new PriorityQueue();
		a.add(1.2);
		a.add(2.3);
		a.add(4.5);
		System.out.println(a); // only similar datatype value can be inserted

		Queue b = new PriorityQueue();
		b.add("gopal");
		b.add("tyagi");
		b.add("ji");
		System.out.println(b);
	}

}
