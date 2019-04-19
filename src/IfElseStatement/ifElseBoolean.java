package IfElseStatement;

import java.util.Scanner;

public class ifElseBoolean {
	public static void main(String[] args) {
// Given an integer, n , perform the following conditional actions:
// If  is odd, print "Weird"
// If  is even and in the inclusive range of 2 to 5, print "Not Weird"
// If  is even and in the inclusive range of 6 to 20, print Weird
// If  is even and greater than 20 , print Not Weird
		
		System.out.println("Please enter:");
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    boolean condition;
	  
	    int remainder = n % 2;
	    
		if(remainder == 1) {
		    condition = false;
			System.out.println("Weird" );	
		}
		else if (remainder == 1 && n >= 2 && n <=5){
			System.out.println("Not Weird");
		}
		else if(remainder == 1 && n >= 6 && n >= 20) {
		 
			System.out.println("Weird");
		}
		else if (n > 20) {
			condition = true;
			System.out.println("Not Weird");
		}
		
	}

}
