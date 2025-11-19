package com.prowings.Java2025.Stringclass;

public class StringConcatinationSenario {
	public static void main(String[] args) {
		String s1 =10+20+"hello";
		System.out.println(s1);
		
		String s2 = "hello"+10+20;
		System.out.println(s2);
		
		System.out.println("---------------------");
		
		String result = String.join("_", "Java","Spring","Microservices");
		System.out.println(result);
	}

}
