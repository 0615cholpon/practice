package IfElseStatement;

import java.util.Scanner;

public class Profile {
	
	public static void main(String[] args) {
		String color = "Blue";
		//color.equals("red); //comparing to color "red"
	//color.length(); //returns length of the string;
		
	color.equals("red")	;
	int size = color.length();
	System.out.println(size);
	
	String name = "Cholpon";
	int letter = name.length();
	System.out.println(letter);	
	
	Scanner input = new Scanner (System.in);

	System.out.println("Please create a password to create: ");
	String password = input.nextLine();
	int lengthOfPassword = password.length();
	//if(password.length() <= 5 && password.length() <= 12) {};
	
	if(lengthOfPassword >= 5 && lengthOfPassword <= 12) {
		System.out.println(password + " created!");
	} 
	else {
		
		if(lengthOfPassword > 5) {
		System.out.println("Password length is too short");
		
		// if you have more than two statements u need to put in {};
		// 
	}
		else {
			System.out.println("Password length is too long");
	}
		
	}
	}
}
		



	
	
	
	

