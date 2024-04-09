package com.mystream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {

		String[] a = { "one", "two", "three" };
		Stream<String> s = Arrays.stream(a);

		s.filter(e -> e.startsWith("t"))
		.distinct().forEach(x -> System.out.println(x));
	}
}