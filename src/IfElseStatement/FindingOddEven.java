package IfElseStatement;

import java.util.Random;
import java.util.Scanner;

public class FindingOddEven {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
// Random--> a class that comes from JAVA and helps 
// us to generate some #s.
//		
//Random random = new Random ();
//random.nextInt();
//int secretNumber = random.nextInt(10);
//		
//System.out.println("Please enter your number between 0 and 10:");
//		int guessNumber = input.nextInt();
//	    boolean answer = false;
////		
//		if (guessNumber == secretNumber) {
//		System.out.println("Congratulations!");
//	}
//		else if(guessNumber < secretNumber ) {
//			System.out.println("Your guess is too low");
//		}
//	    else {
//		System.out.println("Your guess is too high!");
//	}
//		
//		System.out.println("Found: " + answer);
//		if (answer == false) {
//			System.out.println("This is your last chance. Please enter the second number: ");
//		int secondguess = input.nextInt();
//		if(secondguess == secretNumber) {
//			System.out.println("Congratulations! You found it!");
//		}
//		else {
//			System.out.println("You missed!");
//			
//		}
//		
//		
//		}
//// bound -> boundry -> limit;
//		
//		System.out.println("The secret number was: "+ secretNumber);
//		
//	}
//		
//	}
//	 

// TASK #5:
		
		
boolean sent = false; //less than 15 characters sent;
boolean delivered = false;
System.out.println("Please enter the message to send: ");
String message = input.nextLine();

if(message.length()>=15) {
	sent = true;
	delivered = true;
}
else {
	sent = false;
	}


System.out.println("Message: " + message);
System.out.println("Sent: " + sent);



Random random = new Random ();
int number = random.nextInt(10);

if (number%2==0) {
	delivered = true;
	
}
else {
	delivered = false;
}


System.out.println("Delivered: " + delivered);

	}	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
