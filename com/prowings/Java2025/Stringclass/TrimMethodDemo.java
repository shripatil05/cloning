package com.prowings.Java2025.Stringclass;

public class TrimMethodDemo {
	public static void main(String[] args) {
		
		String s =" helloworld ";
		System.out.println(s);
		
		s =s.trim();
		System.out.println(s);
		
		String res =s.substring(5);
		System.out.println(res);
		
		System.out.println("---------------------------------");
		
		String s1 =" hello JavaDevloper ";
		
		System.out.println(s1);
		
		String strippedstr =s1.strip();
		System.out.println(strippedstr);
	}

}
