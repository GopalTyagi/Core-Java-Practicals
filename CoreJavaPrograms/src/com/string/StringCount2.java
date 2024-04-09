package com.string;

public class StringCount2 {
	public static void main(String[] args) {

		String s = "Goooppaal";
		int count = 0;
		char[] ch = s.toCharArray();
		for (char c : ch) {

			if (c == 'o') {
				count++;

			}
		}
		System.out.println(count);
	}

}
