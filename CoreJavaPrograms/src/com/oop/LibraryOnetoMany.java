package com.oop;

import java.util.List;

public class LibraryOnetoMany {

	List<BookOnetoMany> book;

	public LibraryOnetoMany() {
	}

	public LibraryOnetoMany(List<BookOnetoMany> book) {
		this.book = book;
	}

	public List<BookOnetoMany> getBook() {
		return book;
	}
}
