package com.mycollection;

import java.util.Comparator;

public class BookOrderByName implements Comparator<Marksheet>{

	
	
	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	

}
