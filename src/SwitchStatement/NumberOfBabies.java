package SwitchStatement;

import java.util.Scanner;

public class NumberOfBabies {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int numberOfBabies;

		System.out.println("Please enter the number of babies: ");
		numberOfBabies = input.nextInt();
		
		switch (numberOfBabies) {
		case (1):
			System.out.println("Wow!");
			break;
		case (2):
			System.out.println("Good for you!");
			break;
		case (3):
			System.out.println("Congratulations!");
			break;
		case (4): 
			System.out.println("Really?! Wow!");
			break;
		default:
			System.out.println("Please make sure that you have enough strengh!");
			break;
		}
        
		int SeatLocation;
		System.out.println("Please enter seat location: ");
		SeatLocation = input.nextInt();
		
		double price;
        price = 0;
  // if you store input, console will wait for us to put the price for the seat;      
		
	switch (SeatLocation) {
	
	case 1:
		System.out.println("Orchestra");
		price = 40.00;
		
		break;
		
	case 2: 
		System.out.println("Mezzanine");
		price = 30.00;
		
		break;
		
	case 3:
		System.out.println("Balcony");
		price = 15.00;
	
		break;
		
	default:
		System.out.println("Unknown ticket code! Please make sure you are writing correctly!");
		break;
		}
		
		System.out.println("The price of your ticket is : " + price);
	
	
	
	
	}
	
	
	
	}


