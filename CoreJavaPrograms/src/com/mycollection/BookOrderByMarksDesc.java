package com.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookOrderByMarksDesc implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
	if(m1.marks > m2.marks) {
		return -1;
	}else if (m1.marks == m2.marks) {
		return 0 ;
	}else {
		return 1;
				
	}
	
	}
public static void main(String[] args) {
	ArrayList marksheet = new ArrayList();
	marksheet.add("rass");
	marksheet.add("ama");
	BookOrderByName cName = new BookOrderByName();
	Collections.sort(marksheet,cName);
	System.out.println(marksheet);
	BookOrderByMarksDesc cMarks = new BookOrderByMarksDesc();
	Collections.sort(marksheet,cMarks);
}
	
}
