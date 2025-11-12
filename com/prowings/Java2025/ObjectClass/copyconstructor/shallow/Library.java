package com.prowings.Java2025.ObjectClass.copyconstructor.shallow;

public class Library {
	private int libraryId;
	private String libraryname;
	private String book1;
	
	public Library() {
		
	}

	public Library(int libraryId, String libraryname, String book1) {
		super();
		this.libraryId = libraryId;
		this.libraryname = libraryname;
		this.book1 = book1;
	}
	
	public Library(Library lib) {
		this.libraryId = lib.libraryId;
		this.libraryname = lib.libraryname;
		this.book1 = lib.book1;
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

	public String getBook1() {
		return book1;
	}

	public void setBook1(String book1) {
		this.book1 = book1;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryname=" + libraryname + ", book1=" + book1 + "]";
	}
	
	

}
