package com.mycollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmployeeComparatorTest {
	public static void main(String[] args) {

		Employee1 e = new Employee1(103, "gopal", 500);
		Employee1 e1 = new Employee1(101, "krishna", 77087);
		Employee1 e2 = new Employee1(109, "aman", 6060);

		ArrayList l = new ArrayList();
		l.add(e);
		l.add(e1);
		l.add(e2);

	//	Collections.sort(l, new SortByName());
	//	Collections.sort(l, new SortBySalary());
	
		for (Object obj : l) {
			System.out.println(obj);
		}
	}
}