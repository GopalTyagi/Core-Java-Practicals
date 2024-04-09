package com.mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class FailFastProgram {
	public static void main(String[] args) {
		//List l = new ArrayList();
		ArrayBlockingQueue<Integer> l = new ArrayBlockingQueue<>(7);
		l.add(1);
		l.add(2);
		l.add(3);
		
		Iterator it = l.iterator();
		l.add(4);
		l.add(5);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
