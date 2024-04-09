package com.oop;

public class EmployeeOnetoOne {

	int id;
	String name;
	AddressOnetoOne empAddress;
	
	public EmployeeOnetoOne() {
	}
	
	public EmployeeOnetoOne (int id,String name,AddressOnetoOne empAddress) {
		this.id = id;
		this.name = name;
		this.empAddress = empAddress;
	}
}
