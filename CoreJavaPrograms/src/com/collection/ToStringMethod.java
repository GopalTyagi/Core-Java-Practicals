package com.collection;
import java.util.ArrayList;

public class ToStringMethod {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		Integer i = new Integer(1);
				i = new Integer(2);
				i = new Integer(3);
				i = new Integer(4);
				
				
				//or//
				
				a.add(1);
				a.add(2);
				a.add(3);
				a.add(4);
				
				Object o = a.get(1);
				System.out.println(1 +" : "+ o.toString());
		
	}
	}



