package com.javabasic;

public class ArmsTest {
	public static void main(String[] args) {
		ArmsInterface ai = (b) -> {

			int sum = 0;
			int r;
			int a = b;
			while (b > 0) {
				r = b % 10;
				sum += (r * r * r);
				b = b / 10;
			}
			if (sum == a) {
				System.out.println("Armstrong Hai");
			} else {
				System.out.println("Nahi hai Armstrong");
			}
		};
		ai.arms(153);
	}

}
