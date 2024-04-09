package com.oop;

public class BParameterizedConstSuper extends AParameterizedConstSuper{
	public String surname;
	
	
	public BParameterizedConstSuper(String surname) {
	//	super();
	super("Gopal");
	 this.surname = surname;
	 System.out.println(surname);
}
}
