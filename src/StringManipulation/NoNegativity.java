package StringManipulation;

import java.util.Scanner;

public class NoNegativity {
	public static void main(String[] args) {
	// write a program that asks for the message from the user
	// replace the word with "love"
	// print with new version
		
		Scanner input = new Scanner (System.in);
		
		String message;
		System.out.println("Please write your message: ");
		message = input.nextLine();
		message = message.replace("hate", "love");
		System.out.println(message);
	
	//    ANOTHER LONGER VERSION!
//		System.out.println("Please enter your message: ");
//		message = input.nextLine();
//		String badWord = "hate";
//		String goodWord = badWord.replace("hate", "love");
//		System.out.println("I" + goodWord + " you!");
//		
		
		
		
	}

}
