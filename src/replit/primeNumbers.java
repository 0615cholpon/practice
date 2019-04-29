package replit;

import java.util.Scanner;

public class primeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		boolean check = false;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				check = true;
				System.out.println(number + " is not prime number!");
				break;
			}
		}
		
		if(!check) {
			System.out.println(number + " is prime number!");
		
		}
	}

}
