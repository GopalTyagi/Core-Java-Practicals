package com.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEvenOdd {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(9);
		
	//	Stream<Integer> str = l.stream();
		
		l.stream().filter(e-> e%2==0).forEach(e->System.out.println(e));
	
	}

}
