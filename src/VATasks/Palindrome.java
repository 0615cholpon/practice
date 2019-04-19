package VATasks;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = input.nextLine();
		
		String revWord = "";
		int LastIndex = word.length()-1;
		while(LastIndex >= 0) {
		revWord = revWord + word.charAt(LastIndex);
		LastIndex--;
	}
		//System.out.println(revWord);
		if(word.equalsIgnoreCase(revWord)) {
			System.out.println("Palindrome!");
		}else {
		System.out.println("Not Palindrome!");
		}
}
}