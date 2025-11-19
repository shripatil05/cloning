package com.prowings.Java2025.Stringclass;

public class ReplaceMethodDemo {
	public static void main(String[] args) {
		String s1 ="helloworld";
		
		System.out.println("Original s1 :"+s1);
		
		String replacedstr = s1.replace('w', 'W');
		System.out.println("Replaced string :"+replacedstr);
		
		String s2 = s1.replace("world","javaDevloper");
		System.out.println("Replaced string :"+s2);
		
	}

}
