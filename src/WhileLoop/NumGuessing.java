package WhileLoop;

import java.util.Scanner;

public class NumGuessing {
	public static void main(String[] args) {
		int secNUm = 45;
		Scanner input= new Scanner (System.in);
		System.out.println("Please enter your guess number: ");
		int guess = input.nextInt();
		
		while(guess != secNUm) {
			System.out.println("Wrong! Enter your guess number: ");
			guess = input.nextInt();
		}
		System.out.println("Congrats!");
	}

}
