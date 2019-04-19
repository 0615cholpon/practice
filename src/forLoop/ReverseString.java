package forLoop;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word: ");
		String word = input.nextLine();
		
		int LastIndex =word.length()-1;
		String reversed = "";
	
		for(int i = LastIndex; i >= 0; i--) {
			//System.out.println(word.charAt(i));
			reversed += word.charAt(i);
		}
		if (word.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome!");
		}else {
			System.out.println("Not Palindrome!");
		}
		}

	}

