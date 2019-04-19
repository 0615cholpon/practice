package VATasks;

import java.util.Scanner;

public class WhilePincodeConditional {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int SecPincode = 1234;
		int pincode = 0;
		int attempt = 0;
		while(pincode != SecPincode && attempt <= 3) {
			System.out.println("Enter your pincode: ");
			pincode = input.nextInt();
			attempt ++;
		 if(attempt > 3 && pincode != SecPincode) {
			System.out.println("Your card is blocked!");
			return;
		}
		}
		System.out.println("Welcome to your page!");
		
	}

}
