package com.prowings.Java2025.ObjectClass.copyconstructor.shallow;

public class TestShallowCopyConstructor {
	public static void main(String[] args) {
		
		Library lib = new Library(101,"City Library","Java programming");
		System.out.println("Orignal book :"+lib);
		
		Library lib2 = new Library(lib);
		System.out.println("Copied book :"+lib2);
		
	}

}
