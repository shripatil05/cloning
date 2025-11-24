package com.prowings.Java2025.string.interviewprogram;

public class WordOccurance {
	public static void main(String[] args) {
		System.out.println("Main method started!!");
		
		String input ="India is my country India is beautiful country";
		
		findWordOccurance(input);
		System.out.println("Main method ended!!");
	}
	
	public static void findWordOccurance(String input) {
		String[] words =input.split(" ");
		
		boolean[] visited = new boolean[words.length];
		
		for(int i=0;i<words.length;i++) {
			if(visited[i]) {
				continue;
			}	
			int count = 1;
			
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					count++;
					visited[j] = true;
				}
				
			}
			
			System.out.println(words[i]+" "+count);
		}
		
		
	}

}
