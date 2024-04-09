package com.mystream;

import java.util.Arrays;
import java.util.List;

public class TotalCount {
	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 7, 8);
		long count = l.stream().count();
		System.out.println(count);
	}

}
