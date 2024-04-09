package com.javabasic;

public class Triangle {
	
	public static void main(String[] args) {
		for(int i=1; i<=7; i++) {
			for(int j=7-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=i; k>0; k--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
