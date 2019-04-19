package VATasks;

import java.util.Random;
import java.util.Scanner;

public class doWhileGuessNum {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random magic  = new Random();
	System.out.println("Welcome to a guess number game!");	
	System.out.println();
    int guessNumber;
	int secretNumber = magic.nextInt(101);
		
		do { 
			System.out.println("Please enter your number:");
			guessNumber = input.nextInt();
			
		    if(guessNumber > secretNumber) {
				System.out.println("Your guess number is too high!");
				
			}else if(guessNumber < secretNumber){
				System.out.println("Your guess number is too low!");
				
			}	
		} while(guessNumber != secretNumber);
		System.out.println("Congratulations, you found it!");
		
	}

}
