package com.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestSalaryByStream {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(3000);
		l.add(9000);
		l.add(2000);
		l.add(5000);
		l.add(10000);
	
		
		l.parallelStream().sorted(Collections.reverseOrder()).
		findFirst().ifPresent(e -> System.out.println(e));
	
	}
	

}
