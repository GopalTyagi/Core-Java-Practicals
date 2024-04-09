package com.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondHighestSalary {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5000);
		list.add(4999);
		list.add(9000);
		list.add(12930);
		
		list.stream().sorted(Collections.reverseOrder()).skip(1)
		.findFirst().ifPresent(e->System.out.println(e));
		
	
	}

}
