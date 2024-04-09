package com.mycollection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionReverseAndSort {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(23);
		l.add(3);
		
		
	//	Collections.sort(l);
		Collections.reverse(l);
		System.out.println(l);
	}

}
