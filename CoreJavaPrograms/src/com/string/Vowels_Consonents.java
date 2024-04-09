package com.string;

public class Vowels_Consonents {

	public static void main(String[] args) {

		String name = "Gopal Tyagiii ji";

		int x = 0;
		int y = 0;

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				x++;
			} else if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
				y++;
			}

			
		}
		System.out.println("Vowels = " + x);
		System.out.println("Consonents = " + y);

	}

}
