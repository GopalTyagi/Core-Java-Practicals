package com.mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class ConcurrentCollection {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);

		Iterator it = l.iterator();
	//	l.add(4);
		while (it.hasNext()) {
			Object o = (Object) it.next();
			System.out.println(o);
		}
		ArrayBlockingQueue a1 = new ArrayBlockingQueue(10);
		a1.add(11);
		a1.add(12);
		a1.add(13);

		Iterator it1 = a1.iterator();
		a1.add(15);
		a1.add(16);
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
