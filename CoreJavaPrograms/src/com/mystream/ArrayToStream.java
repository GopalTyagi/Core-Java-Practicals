package com.mystream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {

		String[] a = { "ram", "seeta", "geeta", "shyam" };

		Stream s = Arrays.stream(a);
		
		// s.forEach(e -> System.out.println(e)); //Arrays se Stream me Convert
		
		// s.forEach(System.out::println);

		System.out.println("---------------------------");

		 s.sorted().forEach(System.out::println); //Sort the elements of Array and
		// print

		// s.sorted(Collections.reverseOrder()).forEach(System.out::println); //Sort the
		// elements and also reverse them and print
		 
	}

}
