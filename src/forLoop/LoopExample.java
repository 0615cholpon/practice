package forLoop;

import java.util.Scanner;

public class LoopExample {
	public static void main(String[] args) {
// Please write a program that asks the name from the user using scanner and 
// print "Welcome, %name" for 15 times.
		Scanner input = new Scanner (System.in);
		
//		System.out.println("Please enter your name: ");
//		String name = input.nextLine();
		
//		for (int i = 0; i < 15; i++) {
//			System.out.println(i);
//			System.out.println("Welcome, " + name);
// Print each character on the new line
// Flow: 

//
//String sepName = name.charAt(0) + "";
//String name3 = name.substring(i);
//for (int b = 0; b < name.length(); b++) {
//	System.out.println(b);
//	System.out.println(name.charAt(b)); // will print out all the letters separately
////	System.out.println(name);
	
//Please print out only odd numbers from 0-5;
	
//	for (int num2 = 0; num2 < 50; num2++) {
//	if (num2%2==0) {
//		
//		System.out.println(num2);	
//	}
//	else {
//		System.out.println("Even number here");
//	}
//	
//	}
////          OR IN THIS WAY!
//	for (int num = 1; num < 50; num += 2) {
//		System.out.println(num);
	
	
// Modify the statement and print "even number here"
	/////////////////////////////////////
	
//Write a program that asks 5 names from the user and print each name .
	
//		String words;
//		//System.out.println("Please enter hi or bye: ");
//		words = input.nextLine();
//	for (int num = 7; num > 1; num ++) {
//		if(words.equals("hi")) {
//			System.out.println("Hello");
//			
//		}else if(words.equals("bye")) {
//			System.out.println("Good bye!");// else{System.out.println ("Good bye")}
//		}
//			
//		}
		
// write a program  from user infinitely ( ; ; ){};
// if user enters "hi" your program answers "hello";
// if user enters "bye" your program answers "good bye"

		for( ; ; ) {
			String words = input.nextLine();
			if (words.equalsIgnoreCase("hi")) {
				System.out.println("Hello!");
			}else if(words.equals("exit")) {
				break;
			}
			else {
				System.out.println("Good bye!");
			}
			
		}
		//System.out.println("This is the end of program!");
	}
	
	}

			
		
	


