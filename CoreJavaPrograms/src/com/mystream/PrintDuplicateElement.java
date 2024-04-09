package com.mystream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateElement {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(4,4,5,3,6,7,7,6,5,8,91,2);
		Set<Integer> s = new HashSet<Integer>();
		
		l.stream().filter(n ->!s.add(n))
		.forEach(e->System.out.println(e));
	}

}
