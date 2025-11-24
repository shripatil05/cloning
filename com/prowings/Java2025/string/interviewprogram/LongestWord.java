package com.prowings.Java2025.string.interviewprogram;

public class LongestWord {
	public static void main(String[] args) {
		System.out.println("Main method started!!");
		
		String input ="India is most beautiful country";
		
		String longestWord = FindLongestWord(input);
		
		System.out.println("Longest word in given string is :"+longestWord);
		
		System.out.println("Main method ended!!");
	}
	
	public static String FindLongestWord(String input) {
		String[] words = input.split(" ");
		
		String longestWord = words[0];
		
		for(String w : words) {
			if(w.length() >longestWord.length())
				longestWord = w;
		}
		return longestWord;
	}

}
