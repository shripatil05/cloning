package com.prowings.Java2025.Stringclass;

public class StringEqualityDemo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "Hello";
		String s3 = "HELLO";
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
	}

}
