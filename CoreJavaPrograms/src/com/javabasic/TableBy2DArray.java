 package com.javabasic;

public class TableBy2DArray {
	public static void main(String[] args) {

		int[][] a = new int[10][10];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = (i + 1) * (j + 1);
				
				//Horizontal
				System.out.print(a[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

}
