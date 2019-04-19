package IfElseStatement;

import java.util.Scanner;

public class Credentials {
	public static void main(String[] args) {
		
// write a code that takes the username and password from user on console		
//check if both username & passwd are matching, if matching
// print "Welcome, %username!!!"
// if username is correct but passwd is incorrect print "passwd incorrect"
// if username is incorrect but password is correct then print "username incorrect"
// else print "invalid credentials"
		
		// ! --> negative credentials
		String username = "test";
		String password = "test123";
				
	Scanner input = new Scanner (System.in);
	
	System.out.println("Please write your username: ");
	String enteredUserName = input.nextLine();
	
	System.out.println("Please enter your password: ");
	String enteredPassword = input.nextLine();
	
	if(enteredUserName.equals(username) && enteredPassword.equals(password)) {
		System.out.println("Welcome " + username + "!");
	}
	
	else if(enteredUserName.equals(username) && !enteredPassword.equals(password)) {
		System.out.println("Password incorrect!");
	}
	else if (!enteredUserName.equals(username)  && enteredPassword.equals(password)) {
		System.out.println("Invalid username!");
		
	}
	else {
		System.out.println("Invalid credentials!");
	}
	}
}
	


