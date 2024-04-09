package com.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighSal {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(120000);
		l.add(43434);
		l.add(77777);
		
		l.parallelStream().sorted(Collections.reverseOrder()).skip(1).
		findFirst().ifPresent(e->System.out.println(e));
	}

}
