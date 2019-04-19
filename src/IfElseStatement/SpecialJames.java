package IfElseStatement;

import java.util.Scanner;

public class SpecialJames {
	public static void main(String[] args) {
	// write a program that asks the name from the user 
	//if their name is "James" then ask for their last name;
	// if their name isn't James don't ask for their last name
	// give value "nobody" if the name isn't James;
		
		// USE: NESTED
		
		Scanner input = new Scanner (System.in);
		 String name = "James";
		 boolean answer;
		 String Nobody;
		 String lastName;
		 
		 System.out.println("Please enter your name: ");
		 name = input.nextLine();
		 
		 if(name.equals("James")) {
			 System.out.println("Please enter your last name: ");
			 lastName = input.nextLine();
		 }
		 
		 else  {
		lastName = "Nobody";
		 }
		System.out.println("Firstname: " + name);
		System.out.println("Lastname: " + lastName);
		
	}

}
