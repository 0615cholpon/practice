package IfElseStatement;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	Random random = new Random ();

	int guessNumber;
	int randomNumber = random.nextInt(10);
	boolean answer = false;
	int guessNum2;
	
	System.out.println("Please enter your guess number: ");
	guessNumber= input.nextInt();
	
	if(guessNumber < 0 || guessNumber >10) {
		System.out.println("Please make sure you are entering numbers btw 0 and 10");
	}
	else if(guessNumber == randomNumber) {
		System.out.println("Congratulations!");
		answer = false;
	}
	else if (guessNumber <randomNumber) {
		System.out.println("Your guess is too low!");
		
	} else if( guessNumber> randomNumber) {
		System.out.println("Your guess is too high!");	
	}
	System.out.println("Last chance. Please enter one more time: ");
	guessNum2 = input.nextInt();
	
	if (answer = false) {
		System.out.println("You won!");
	}
	else {
		System.out.println("You lost!");
	}
	
	System.out.println("Random number is: " + randomNumber);
	
	
}
}
