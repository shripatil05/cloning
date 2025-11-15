package com.prowings.Java2025.Stringclass;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("Ram");
		String s2 = new String("Ram");
		
		System.out.println("Reference equality :"+(s1==s2));
		System.out.println("Content equality :"+(s1.equals(s2)));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("-----------------------------------");
		
		String s3 = "Ram";
		String s4 = "Ram";
		
		System.out.println("s3 :"+s3);
		System.out.println("s4 :"+s4);
		s3 = s3.concat("Kumar");
		System.out.println(s3);
		
		System.out.println("Reference equality :"+(s3==s4));
	}

}
