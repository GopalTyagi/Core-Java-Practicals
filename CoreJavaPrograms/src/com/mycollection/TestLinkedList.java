package com.mycollection;

import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(20);
		l.add("gopal");
		l.add(13);
		l.add(6);

		System.out.println(l); // it follow insertion (as it as) order

		
		
		System.out.println(l.contains(20)); // return true
		
		System.out.println(l.element()); // it will fetch element not remove
		
		System.out.println(l.get(1)); // it will fetch 1 index element
		
		System.out.println(l.getFirst()); // it will fetch first element
		
		System.out.println(l.getLast()); // it fetch last element
		
		System.out.println(l.indexOf(13)); // it return indexing of element 13

		System.out.println(l.offer(130)); // it insert 130 in last of list and return boolean true
		
		System.out.println(l.offerFirst(90)); // it insert element in first return boolean true
		
		System.out.println(l.offerLast(60)); // it insert element in last and return boolean true
		
		System.out.println(l.peek()); // it return first element 20 not remove
		
		System.out.println(l.peekFirst()); // it also return first element 20 not remove
		
		System.out.println(l.peekLast());// it return last element not remove
		
		System.out.println(l);
		
		System.out.println(l.poll()); // it return first element (20) and also remove it
		
		System.out.println(l);

		
		
		System.out.println(l.pollFirst()); // it will remove first element and show that element
		
		System.out.println(l);
		
		System.out.println(l.pollLast()); // it will remove last element and show that element
		
		System.out.println(l.pop()); // it remove the element and show that element
		
		System.out.println(l);
		
		System.out.println(l.remove()); // it remove the element and show that element
		
		System.out.println(l.remove(2)); // it will remove element by index
		
		System.out.println(l.removeFirst()); // it will remove first element
		
		System.out.println(l);
		
		System.out.println(l.removeLast()); // it will remove last element
		
		System.out.println(l);
		
		System.out.println(l.set(0, 132)); // it set element by passing index no. and element
		
		System.out.println(l);
		
		System.out.println(l.size()); // it will show us actual size of list
		
		l.addFirst("Rahul"); // it will add element on first position
		
		l.addLast("verma"); // it will add element in last position
		
		l.push("tyagi"); // it will also adding an element on first position
		
		System.out.println(l);

		
	}

}
