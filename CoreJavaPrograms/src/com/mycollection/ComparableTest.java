package com.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(new ComparableEx(109,"zakar",89));
		l.add(new ComparableEx(102,"aman",60));
		l.add(new ComparableEx(107,"raman",90));
		l.add(new ComparableEx(101,"naman",50));
		
		Collections.sort(l);
		System.out.println(l);
		System.out.println("-----------------");
		Collections.reverse(l);
		System.out.println(l);
	
	}

}
