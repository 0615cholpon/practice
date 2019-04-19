package StringManipulation;

import java.util.Scanner;

public class FirstandSecondLetterSkip {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word: ");
		String n1 = input.nextLine();
	
		//char firstandSecondX = n1.charAt(0);
		char firstLetterX = n1.charAt(0);
		char secondLetterX = n1.charAt(1);
		if(firstLetterX == 'x' && secondLetterX == 'x') {
			System.out.println(n1.substring(2));
		
		}else if(firstLetterX == 'x') {
			System.out.println(n1.substring(1));
		}else if(secondLetterX=='x') {
			System.out.println(n1.replaceFirst("x", ""));
	}else {
		System.out.println(n1);
	}
	} 
}
