package com.oop;




// polymorphism use as Array
public class PolymorphismArray {

	public static void main(String[] args) {

		Shape[] s = new Shape[2];
		s[0] = new Rectangle(5,6);
		s[1] = new Circle(5);

		System.out.println(s[0].area());

	}

}
