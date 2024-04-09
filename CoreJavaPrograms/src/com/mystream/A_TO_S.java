package com.mystream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class A_TO_S {
	public static void main(String[] args) {
		String[] s= {"one","three","zero"};
		Stream s1 = Arrays.stream(s);
		
		s1.sorted(Collections.reverseOrder()).forEach(e-> System.out.println(e));
		//s1.sorted().forEach(e-> System.out.println(e));
	}

}
