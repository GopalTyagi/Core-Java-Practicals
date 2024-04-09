package com.oop;

//Constructor Overloading
public class Personn {

	String firstname;
	String lastname;
	String address;
	
		
	

	public Personn() {
		System.out.println("this is default constructor");
	}

	public Personn(String Firstname, String Lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("same class");
	}

	public Personn(String Firstname, String Lastname, String add) {
		this(Firstname, Lastname);
		address = add;
		System.out.println("calling constructor from same class");
	
	}
	public static void main(String[] args) {
		
		 Personn E = new Personn("ccc","Chauhan", "Devloper");
				 
	}
}