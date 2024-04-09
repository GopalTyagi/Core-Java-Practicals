package com.oop;

public class Circle extends Shape {

	private int radius;

	public Circle(int rad) {
		this.radius=rad;
	}

	public void setRadius(int r) {
		this.radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public double area() {
		double arr = 3.14 * radius * radius;
		System.out.println("area of cicrle"+arr);
		return arr;

	}

}
