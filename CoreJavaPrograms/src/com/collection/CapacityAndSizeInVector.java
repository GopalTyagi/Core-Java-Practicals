package com.collection;

import java.util.Vector;

public class CapacityAndSizeInVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		System.out.println(v.capacity());
		//by default capacity is 10
		System.out.println(v.size());
		//size will depends on how many elements are there
		
		Vector v1 = new Vector();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		v1.add(6);
		v1.add(7);
		v1.add(8);
		v1.add(9);
		v1.add(10);
		v1.add(11);
		
		
		System.out.println(v1.capacity());
		//capacity grow by double of its size 
		//20
		//System.out.println(v1.size());
		//11
		
		//Capacity increases by double of its current capacity whereas in arraylist its increases by half of its current capacity
		//Vector capacity can be predefined
		 Vector v2 = new Vector(5);
		 System.out.println(v2.capacity());
		 //capacity will be 5
		 v2.add(1);
		 v2.add(2);
		 v2.add(3);
		 v2.add(4);
		 v2.add(5);
		 v2.add(6);
		 //Now capacity will increase by double of its current capacity //10
		 
		 System.out.println(v2.capacity());
		 
		
		 Vector v3 = new Vector(3,2);
		 v3.add(1);
		 v3.add(2);
		 v3.add(3);
		
		 
		 System.out.println(v3.capacity());
		 System.out.println(v3.size());
		 v3.add(4);
		 System.out.println(v3.capacity());
		 //capacity will increase by 2
		 System.out.println(v3.size());
		 
		
	}

}
