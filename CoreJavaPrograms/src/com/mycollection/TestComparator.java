package com.mycollection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("vijay", 23, 1120000));
		al.add(new Employee("ram", 25, 34000));
		al.add(new Employee("lalit", 45, 7600000));

		System.out.println("Sorting by salary");
		Collections.sort(al, new SalaryComparator());
		for (Employee em : al) {
			System.out.println(em.name + " " + em.id + " " + em.salary);
		}

	}
}
