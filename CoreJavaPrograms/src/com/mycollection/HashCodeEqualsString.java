package com.mycollection;

public class HashCodeEqualsString {
	
	public int id;
	public String name;
	public int salary;

	public HashCodeEqualsString(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public int hashCode() {
		String str = this.id + this.name + this.salary;
		return str.hashCode();

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof HashCodeEqualsString)) {
			return false;
		}
		HashCodeEqualsString a = (HashCodeEqualsString) obj;
		String s1 = this.id + this.name + this.salary;
		String s2 = a.id + a.name + a.salary;
		return s1.equals(s2);

	}

}
