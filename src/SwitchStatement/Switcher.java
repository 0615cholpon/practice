package SwitchStatement;

import java.util.Scanner;

public class Switcher {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		String name = "John";
		
		switch (name) {
		case "James":
			System.out.println("James is a cool name");
			break;
			
		case "Jamie":
		System.out.println("Jamie is ok name");
		break;
		
		case "John":
			System.out.println("John Wick?!");
			break;
			default:
				System.out.println("Everything else");		
		
		}	
	// convert to if else statement;
		
		if(name.equals("James")) {
			System.out.println("James is a cool name");
		}
		else if (name.equals("Jamie")) {
			System.out.println("Jamie is ok name"); 
				
			}
			else if(name.equals("John")) {
				System.out.println("John Wick?");
			}
			else {
				System.out.println("Everything else");
			}
			}
		
		
	}


// now program knows which John, so it prints out "John Wick?"
// we not checking for boolean, we r checking cases (exact values) for this reason we use Switch.

       
