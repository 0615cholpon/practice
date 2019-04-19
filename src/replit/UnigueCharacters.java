package replit;

import java.util.Scanner;

public class UnigueCharacters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your word: ");
		String word = input.nextLine().toLowerCase();
		
		
		
		int wordLength = word.length();
		String result = "";
		
		for (int i = 0; i < wordLength; i++) {
			char letters = word.charAt(i);
		if(result.contains(letters + "")) {
			continue;	
		}
		result += letters;
	}
		System.out.println(result);
	}
}
