package Inputs;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	String username, password;
	
	
		System.out.println("\tCybertek Chicago 11!\n");
		System.out.println("Program running:\n ");
		System.out.println("Please enter username: ");
		username = input.nextLine();
		
		
		System.out.println("Please enter password: ");
		password = input.nextLine();
		
		System.out.println("\tWelcome, " + username);
		System.out.println("\tProfile "  + "\tPictures " + "\tVideos ");
		System.out.println("\tPosts " + "  \tLikes " + "\t\tComments ");
		System.out.println("\tProducts " + "\tOrders. " + "\tFeedbacks\n");
		
		
	String firstName, lastName, address;
	long creditCard;
	
	System.out.println("Program running:\n");
	System.out.println("Profile edit Page\n");
	System.out.println("Please enter your firstname: ");
	firstName = input.nextLine();
	
	System.out.println("Please enter our lastname: ");
	lastName = input.nextLine();
	
	System.out.println("Please enter your address: ");
	address = input.nextLine();
	
	System.out.println("Please enter your credit card number: ");
	creditCard = input.nextLong();
	
	
	System.out.println("Information you entered:\n ");
	System.out.println("Name: " + firstName + " " + lastName);
	System.out.println("Address: " + address);
	System.out.println("CC Number: " + creditCard);
	
	
	String answer;
	answer = input.nextLine();
	
	System.out.println("Save now?");
	System.out.println(">Yes\n" + ">No\n");

	
	answer = input.nextLine();
	
	System.out.println("\nThank you!");
	
	
		
		
		
	
		
		
	
		
	}	
		
	}

