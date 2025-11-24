package com.prowings.Java2025.string.interviewprogram;

public class CountNumberOfDigitsCharsSpChars {
	public static void main(String[] args) {
		System.out.println("Main method started!!");
		
		String input ="P@ssw0rd#$23";
		countChar(input);
		System.out.println("Main method ended!!");
	}
	
	public static void countChar(String input) {
		char[] chars = input.toCharArray();
		
		int characterCount =0;
		int specialCharCount =0;
		int digitCount = 0;
		
		for(char c : chars) {
			if(Character.isLetter(c))
				characterCount++;
			else if(Character.isDigit(c))
				digitCount++;
			else
				specialCharCount++;
		}
		System.out.println("Total number of characters in given string :"+characterCount);
		System.out.println("Total number of digits in given string :"+digitCount);
		System.out.println("Total number of special characters in given string :"+specialCharCount);
	}

}
