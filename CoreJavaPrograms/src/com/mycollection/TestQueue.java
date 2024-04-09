package com.mycollection;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue q = new PriorityQueue();
		q.offer(1); //it will take similar data type elements
		q.offer(19); //it arrange in Ascending order
		q.offer(12);
		q.offer(2);
		q.offer(32);
		
		System.out.println(q);
		
		System.out.println(q.element()); //it will fetch first elements
		
		System.out.println(q.offer(11));  //to add the elements return boolean
		
		System.out.println(q);
	
		System.out.println(q.peek()); 
		
		System.out.println(q.poll());
		
		System.out.println(q.remove());
		
		System.out.println(q);
	}

}
