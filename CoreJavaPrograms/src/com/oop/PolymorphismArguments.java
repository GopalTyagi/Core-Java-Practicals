package com.oop;


//polymorphism used as MethodArguments 
public class PolymorphismArguments {

	public static void main(String[] args) {

		Shape[] s = new Shape[2];
		s[0] = new Circle(5);
		s[1] = new Rectangle(4, 6);

		double arr = calArea(s);
		System.out.println(arr);
	}

	public static double calArea(Shape[] s) {
		double arr = 0;

		for (int i = 0; i < s.length; i++) {
			arr = arr + s[i].area();
		}
		return arr;

	}

}
