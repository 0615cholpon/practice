package IfElseStatement;

import java.util.Scanner;

public class MentoringIfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x, y;
//		System.out.println("Please enter number:");
//		x = input.nextInt();
//		y = input.nextInt();
//		int remainder = x%y;
//		
//		
//		if (remainder==0) {
//		System.out.println("Divisible!");	
//		
//	}
//	else {			
//		System.out.println("Indivisible!");
//			
//		}
		System.out.println("Please enter any number: ");
		x = input.nextInt();
		
		if (x > 100 || x >= 50 && x <=75) {
			System.out.println("YES!");
		}
		
		else {
			System.out.println("NO!");
		}
		
	}

}
