package com.prowings.Java2025.Stringclass;

public class CaseMethodDemo {
	public static void main(String[] args) {
		
		String s1 ="HELLO";
		String s2 ="hello";
		System.out.println(s2);
		
		s2 =s2.toUpperCase();
		System.out.println(s2);
		//s2 = s2.intern();
		
		System.out.println("s1 == s2 :"+(s1 == s2));
		
	}

}
