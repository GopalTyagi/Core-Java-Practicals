package com.javabasic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a = 154;
		int t = a;
		int r;
		int sum = 0;
		while (t != 0) {
			r = t % 10;
			sum = sum + (r * r * r);
			t = t / 10;
		}
		if (sum == a) {
			System.out.println("Armstrong hai");
		} else {
			System.out.println("Nahi hai Armstrong");
		}
	}
}