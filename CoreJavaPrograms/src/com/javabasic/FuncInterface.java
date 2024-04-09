package com.javabasic;

@FunctionalInterface
public interface FuncInterface {

	public default int sum(int a, int b) {
		return (a + b);
	}

	public  int multi(int a, int b);

	
}
