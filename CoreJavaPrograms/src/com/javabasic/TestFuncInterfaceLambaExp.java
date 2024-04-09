package com.javabasic;

public class TestFuncInterfaceLambaExp {

	public static void main(String[] args) {
		FuncInterface f = (a, b) -> {
			return (a + b);
			
		};
		int a = 10;
		int b = 12;
		System.out.println(f.sum(a, b));
	//System.out.println(f.multi(a, b));
	}

}
