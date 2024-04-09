package com.oop;

//Shallow Cloning
public class BankAccount implements Cloneable{

	public double balance = 0;
		
	public BankAccount(double b) {
	
		balance = b;
	}

public Object clone() throws CloneNotSupportedException {
	return super.clone();
}	
}
