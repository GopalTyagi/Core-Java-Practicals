package com.collection;

import java.util.ArrayDeque;

public class DequeInterface {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(1);
		ad.add(2);
		ad.add(3);
		ad.add(4);
		ad.add(5);
		System.out.println(ad);
		ad.addFirst(7);
		//it will insert 7 at first place
		System.out.println(ad);
		ad.addLast(9);
		System.out.println(ad);
		//it will insert 9 at last place
	}

}
