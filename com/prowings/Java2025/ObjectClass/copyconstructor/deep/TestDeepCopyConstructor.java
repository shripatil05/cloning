package com.prowings.Java2025.ObjectClass.copyconstructor.deep;

public class TestDeepCopyConstructor {
	public static void main(String[] args) {
		Book b1 = new Book(201,"Java programming");
		Library lib = new Library(101,"city library",b1);
		
		System.out.println("Orignal library Object :"+lib);
		
		Library lib2 = new Library(lib);
		
		System.out.println("Copied book :"+lib2);
		
		System.out.println("---------------- updated info--------------");
		
		lib2.getBook1().setBookname("Python programming");
		
		System.out.println("after update :"+lib);
		System.out.println("after update :"+lib2);
	}

}
