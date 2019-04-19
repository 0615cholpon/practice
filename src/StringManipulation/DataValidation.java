package StringManipulation;

import java.util.Scanner;

public class DataValidation {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String name;
		
		System.out.println("Please enter your name: ");
		name = input.nextLine().trim();
		 
		if(name.isEmpty()) {
			System.out.println("You didn't provide the name");
			
		}
		else {
		System.out.println("Your name is: " + name);
		
		}
		
	}

}
