package com.javabasic;

public class TestFuncInterface {

	public static void main(String[] args) {
		FuncInterface f = new  FuncInterface() {
	  
	  public  int sum(int a, int b) { 
		  return (a + b);
		  }


	public int multi(int a, int b) {
		return (a*b);

		
	} 
	  };
	  int a=20;
	  int b=10;
	  
	  System.out.println(f.sum(a, b));
	 System.out.print(f.multi(a, b));
	
	}

}
