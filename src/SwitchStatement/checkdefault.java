package SwitchStatement;

import java.util.Scanner;

public class checkdefault {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please write your grade: ");
		String age = input.nextLine();
		
		
		
		switch (age) {
		case "test":
			System.out.println("You can do it!");
			break;
		case "exam":
			System.out.println("Congratulations!");

	default:
		System.out.println("You need to write!");
	// After default there is no need to write break; 
	// File will read the program
			
		}
		
	}
	
}
