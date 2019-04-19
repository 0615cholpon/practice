package IfElseStatement;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
// get only ages btw 0 to 120;
	// if they enter valid age then print "valid age " else "invalid age"
int age;
System.out.println("How old are you?: ");
age = input.nextInt();

if(age >= 0 && age <= 120) {
	
	System.out.println("Valid Age!");
	if(age >= 21) {
		System.out.println("Welcome to Club!");
	}
	
}
else {
	System.out.println("Invalid age");
	int difference = 21 - age;
	
	
}


	}	
}
