package com.oop;

public class TestOnetoOne {

	public static void main(String[] args) {
		
		AddressOnetoOne a= new AddressOnetoOne("Indore","MP");
		EmployeeOnetoOne e = new EmployeeOnetoOne(1,"Vipin",a);
		
		System.out.println(e.id + " "+ e.name+" "+e.empAddress.state+" "+e.empAddress.city);
	}
}
