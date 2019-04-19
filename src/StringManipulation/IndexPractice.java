package StringManipulation;

import java.util.Scanner;

public class IndexPractice {
	public static void main(String[] args) {
//		String breed = "Huskeys";
//		boolean i = breed.indexOf('s', 3 ); //when we are looking for the second 's' character!
//		System.out.println(i);
		
		// Write a program that detects bad words;
		// heck, silly, idiot;
		// Ask from user to enter the message to send;
		// check the message contains above bad words;
		// if message contains any of those print "Message failed"
		// otherwise, "Message sent"
		String message;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your message: ");
		message = input.nextLine() .toLowerCase(); 
		
		
		int first = message.indexOf("heck");
		int second = message.indexOf("silly");
		int third = message.indexOf("idiot");
		
//		System.out.println(first);
//		System.out.println(second);
//		System.out.println(third);
//		System.out.println(first + ", " + second + ", " + third);
//		// first == -1 && second == -1 && third == -1
		if (first >= 0 || second >= 0 || third >= 0) {
			System.out.println("Message sent!");
		}
		else {
			System.out.println("Message failed!");
		}
		
		
		
	}

}
