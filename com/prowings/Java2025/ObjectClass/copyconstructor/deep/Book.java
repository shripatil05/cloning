package com.prowings.Java2025.ObjectClass.copyconstructor.deep;

public class Book {
	private int bookId;
	private String bookname;
	
	public Book() {
	}

	public Book(int bookId, String bookname) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookname=" + bookname + "]";
	}
	
	
	

}
