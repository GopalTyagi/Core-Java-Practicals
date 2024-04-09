package com.mycollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {
	public static void main(String[] args) {
		Deque d = new ArrayDeque();
		d.offer(12);  //insertion order (same as it is)
		d.offer(1);
		d.offer(11);
		d.offer(32);
		d.offer(3);
		
		System.out.println(d);
		
		System.out.println(d.offerFirst(111));  //add on first place return boolean
		
		System.out.println(d.offerLast(101));  //add on last place return boolean
		
		System.out.println(d.getFirst());  //return first elements
		
		System.out.println(d.getLast());
		
		System.out.println(d.peek());  //return first elements not remove
		
		System.out.println(d.peekFirst());
		
		System.out.println(d.peekLast());
		
		System.out.println(d.poll());
		
		System.out.println(d.pop());
		
		System.out.println(d.remove());
		
		System.out.println(d.pollFirst());
	}
	

}
