package com.oop;

public class Shape {
	
	private int borderwidth;
	private String color;
	
	public Shape () {}
	
	public Shape(int i) {

}

	public void setBorderWidth( int bw ) {
		this.borderwidth = bw;
	}
	
	public int getBorderWidth () {
		return borderwidth;
	}

	public void SetColor (String c) {
		this.color= c;
		
	}
	
	public String getColor() {
		return color;
	}
	
	public  double area() {
		return 0 ;
	}
	
}
