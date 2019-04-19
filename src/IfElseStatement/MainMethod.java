package IfElseStatement;

import java.util.Scanner;

public class MainMethod {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);

	String username1 = "test";
	String userename2 = "james";

	System.out.println("Please enter username to create: ");
	String enteredUsernames = input.nextLine();
	
	
	
	if(enteredUsernames.equals(username1) || enteredUsernames.equals(userename2)) {
	System.out.println("username is taken!");
		
	}
	else {
		System.out.println("username has been created!");
		
		System.out.println("Please create the password to create: ");
		String passwd = input.nextLine();
		
		if(passwd.length() >= 5 && passwd.length() <= 12) {
			System.out.println("Password created successfully!");
			System.out.println("Congratulations, you have created password successfully!");
			System.out.println("Username: " + enteredUsernames);
			System.out.println("Password: " + passwd);
		}
		
		else {
			System.out.println("Invalid password. Please enter lenght between 5 and 12");
		}
		}
		
		System.out.println("\nEnd of Program!");
		
// create a password;
// check passwd <5 but >12
// passwd created
		
		
		
		
	}
	
}

	
	
	
	
	

	
	

