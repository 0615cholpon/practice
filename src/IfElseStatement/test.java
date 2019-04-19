package IfElseStatement;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		int age = 19;
		int permission;
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your age: ");
		permission = input.nextInt();
		
		
		if(permission >= 21) {
			System.out.println("Welcome!");
		}
		else {
			System.out.println("Not valid age!");
			System.out.println("Please come back after: " + (21 - permission) + " years");
		}
	}

}
