package com.mystream;

import java.util.stream.Stream;

public class RandomNumber {
	public static void main(String[] args) {
		Stream.generate(Math::random)
		.limit(2).
		forEach(e -> 
		System.out.println(e * 100));
	}

}
