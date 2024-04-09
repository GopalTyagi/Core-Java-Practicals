package com.oop;

import java.util.ArrayList;

import java.util.List;

public class TestOnetoMany {

	public static void main(String[] args) {
		
		BookOnetoMany b1 = new BookOnetoMany("Java","Ram");
		BookOnetoMany b2 = new BookOnetoMany("Python","Shyam");
		
		List<BookOnetoMany> list = new ArrayList<>();
			list.add(b1);
			list.add(b2);
			
		LibraryOnetoMany lib = new LibraryOnetoMany(list);
		List<BookOnetoMany> listbook = lib.getBook();
		for (BookOnetoMany b : listbook) {
			System.out.println(b.title+" "+b.author);
		}
	}
}
