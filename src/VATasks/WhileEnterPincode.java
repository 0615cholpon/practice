package VATasks;

import java.util.Scanner;

public class WhileEnterPincode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int SecPincode = 1234;
		
		int pincode = 0;
		while(pincode != SecPincode) {
			System.out.println("Please enter the correct pin code!");
			pincode = input.nextInt();
		}
		System.out.println("Correct, what whould you like to buy?!");
	}

}
