package com.mycollection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparatorr {
	public static void main(String[] args) {
		Comparatorr c = new Comparatorr(109, "gopal", 7000);
		Comparatorr c1 = new Comparatorr(106, "krishna", 17000);
		
		Comparatorr c2 = new Comparatorr(101, "aman", 777000);
		
		ArrayList l = new ArrayList();
		l.add(c);
		l.add(c1);
		l.add(c2);
		
		Collections.sort(l, new CompararorOrderByid());
		for(Object obj:l) {
			System.out.println(obj);
		}
	}

}
