package com.prowings.Java2025.ObjectClass.copyconstructor.deep;

public class Library {
	private int libraryId;
	private String libraryname;
	private Book Book1;
	
	public Library() {
		
	}
	
	public Library(int libraryId, String libraryname, Book book1) {
		super();
		this.libraryId = libraryId;
		this.libraryname = libraryname;
		Book1 = book1;
	}
	
	public Library(Library lib) {
		this.libraryId = lib.libraryId;
		this.libraryname = lib.libraryname;
		
		// deep copy constructor
		
		Book copiedBook = new Book();
		copiedBook.setBookId(lib.Book1.getBookId());
		copiedBook.setBookname(lib.Book1.getBookname());
		this.Book1 = copiedBook;
	}

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryname() {
		return libraryname;
	}

	public void setLibraryname(String libraryname) {
		this.libraryname = libraryname;
	}

	public Book getBook1() {
		return Book1;
	}

	public void setBook1(Book book1) {
		Book1 = book1;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryname=" + libraryname + ", Book1=" + Book1 + "]";
	}
	
	
	
	

}
