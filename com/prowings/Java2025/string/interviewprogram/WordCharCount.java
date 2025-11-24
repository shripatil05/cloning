package com.prowings.Java2025.string.interviewprogram;

public class WordCharCount {
	public static void main(String[] args) {
		
		System.out.println("Main method started!!");
		
		String input ="India is my country India is beautiful country";
		
		wordAndCharCount(input);
		System.out.println("Main method ended!!");
	}
	
	public static void wordAndCharCount(String input) {
		String[] words =input.split(" ");
		
		int charCount =0;
		
		for(String word : words) {
			charCount += word.length();
		}
		System.out.println("Number of character excluding space :"+charCount);
		System.out.println("Number of character including space :"+input.length());
	}

}
