package Inputs;

import java.util.Scanner;

public class Success {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		String firstName;
		String lastName;
		String address;
		int age;
		boolean Work = true;
		
		System.out.println("What's my mom's first name?: ");
		firstName = input.nextLine();
		System.out.println(firstName);
		
		System.out.println("What is my mom's lastname?: ");
		lastName = input.nextLine();
		System.out.println(lastName);
		
		System.out.println("What is her address?: ");
		address = input.nextLine();
		System.out.println(address);
		
		System.out.println("How old is she?: ");
		age = input.nextInt();
		System.out.println(age);
		
		System.out.println("Is she at work?: ");
		
		
	
	
	
	}

}
