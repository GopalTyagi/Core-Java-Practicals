package com.mycollection;


import java.util.LinkedList;

public class BookLinkedList {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(12);
		l.add(13);
		
		System.out.println(l);
		
		for(Object o: l) {
			System.out.println(o);
		}
	}

}
