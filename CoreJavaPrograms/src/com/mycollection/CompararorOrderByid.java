package com.mycollection;

import java.util.Comparator;

public class CompararorOrderByid implements Comparator<Comparatorr>{

	@Override
	public int compare(Comparatorr o1, Comparatorr o2) {
		return o1.id-o2.id;
	}

}
