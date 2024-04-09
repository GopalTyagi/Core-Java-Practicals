
package com.mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumber {
public static void main(String[] args) {
	List<Integer> l = Arrays.asList(1,3,5,54,545,43,23);

	
	Integer in = l.stream().
			max(Integer::compare).get();
	
	System.out.println(in);
}
}
                                 