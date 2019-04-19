package Inputs;

import java.util.Scanner;

public class Profile {
	
	public static void main(String[] args) {
		System.out.println("Welcome to my Program!");
		
		String firstName;
		String lastName;
		int age;
	int weight;
	int height;
	
		String location;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		firstName = input.nextLine();
		System.out.println("Welcome Back, " + firstName);
		System.out.println("Please enter your last name: ");
		lastName = input.nextLine();
		System.out.println(lastName);
		System.out.println("Please provide your location: ");
		location = input.nextLine();
		System.out.println(firstName + ", how old are you?");
		age = input.nextInt();
		weight = input.nextInt();
		height = input.nextInt();
			System.out.println("Age: " + age);
			System.out.println("What is your weight?: ");		
		System.out.println("What is your height?: ");
		
	}

}
