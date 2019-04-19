package StringManipulation;

import java.util.Scanner;

public class NoYou {
	public static void main(String[] args) {
// write a code that asks message from user 
// replace all "u" and "U" with empty string.
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your message: ");
		String message = input.nextLine() .toUpperCase();  //.toLowerCase();
	
//		message = message.replace("u", " ");
//	// but in order to keep the original one we need to write just one more time;
//		message = message.replace("U", "");
//		System.out.println(message);
		
		message = message.replace("message", "massage");
				System.out.println(message);
		
	}

}
