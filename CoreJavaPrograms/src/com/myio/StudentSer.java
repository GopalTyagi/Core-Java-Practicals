package com.myio;

import java.io.Serializable;

public class StudentSer implements Serializable{
	transient int id;
	String name ;
	
	public StudentSer(int id ,String  name) {
		this.id=id;
		this.name=name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentSer [name=" + name + "]";
	}
	

}
