package com.mycollection;

public class ComparableEx implements Comparable<ComparableEx> {
	public int id;
	public String name;
	public int marks;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public ComparableEx(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return "Id = " + id + "," + "Name = " + name + "," + "Marks = " + marks + ",";
	}

	public int compareTo(ComparableEx c) {
		return this.id - c.id;
	}

}
