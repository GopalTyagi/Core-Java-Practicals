package com.javabasic;

import java.util.Arrays;

public class SeparateIntDecimal {
	public static void main(String[] args) {

		double[] a = { 30.23, 20.54, 50.00 ,80.39,30};
		int[] x = new int[5];
		double[] y = new double[5];
		for (int i = 0; i < a.length; i++) {
			x[i] = x[i] + (int) a[i];
			y[i] = y[i] + a[i] % 10;
		}
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
	}

}
