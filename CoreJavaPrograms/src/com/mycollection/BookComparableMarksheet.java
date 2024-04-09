package com.mycollection;


public class BookComparableMarksheet implements Comparable<BookComparableMarksheet> {
	public String rollNo;
	public String name;
	public int marks;

	public BookComparableMarksheet(String r, String n, int m) {
		this.rollNo = r;
		this.name = n;
		this.marks = m;
	}

	@Override
	public int compareTo(BookComparableMarksheet m) {
		return rollNo.compareTo(m.rollNo);
	}

	@Override
	public String toString() {
		return rollNo + "," + name + "," + marks;
	}

}
