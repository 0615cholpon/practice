package SwitchStatement;

import java.util.Scanner;

public class KnowledgeValidate {
	public static void main(String[] args) {
		// write a program that asks grade from user
		// user must enter one character they are
		// A, B, C, D, F
		// switch based on characters & print proper message
		// check for the length of the GRADE. If not one character give them proper
		// message
		
	
		
		
        Scanner input = new Scanner (System.in);
        System.out.println(" Please enter your grade: ");
		String grade = input.nextLine();
		
		int size = grade.length();
		
		// grade.toUpperCase();
		// grade.toLowerCase();
		
		
		if(grade.length() > 1) {
			System.out.println("Invalid: Please check that you are entering only one GRADE");
		}
		else {
			
			switch(grade) {
			case "A":
				System.out.println("You are doing a great job!");
				break;
			case "B":
				System.out.println("You can do better!");
				break;
				
			case "C":
				System.out.println("Study and Learn More!");
				break;
				
			case "D":
				System.out.println("ALERT:You need to visit your INSTRUCTOR ASAP!!!");
				break;
				
			case "F": 
				System.out.println("Hope dies last!!! It's never LATE to Study! HANDS UP");
				
				break;

			default:
				System.out.println("Invalid Character!");
				
				break;
			}
		}
	}

}
