package com.mistertandon.model;

import java.util.List;

public class BooKlibrary {

	private List<Book> allBookList;

	private Book getFirstBook;

	public List<Book> getAllBookList() {
		return allBookList;
	}

	public void setAllBookList(List<Book> allBookList) {
		this.allBookList = allBookList;
	}

	public Book getGetFirstBook() {
		return getFirstBook;
	}

	public void setGetFirstBook(Book getFirstBook) {
		this.getFirstBook = getFirstBook;
	}
	
}
