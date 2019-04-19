package Inputs;

import java.util.Scanner;

public class ACCC {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String Welcome;
		String ACCC;
		String boyFriend;
		int accessories;
		int MotherLand;
		double GPA;
		double  Drive;
		
		System.out.println("GIRLS, We can make it!!!");
		Welcome = input.nextLine();
		
		System.out.println("WELCOME TO ACCC: WE CAN DO IT!!!");
		System.out.println("How did we meet each other? :");
		ACCC = input.nextLine();
		
		
		System.out.println("What is your ideal boyfriend/husband criteria? :");
		boyFriend = input.nextLine();
		
		System.out.println("How much $ would you spend if you found your favorite jewelry? :");
		accessories = input.nextInt();
		
		System.out.println("How long haven't you been in Kyrgyzstan?: ");
		MotherLand = input.nextInt();
		
		System.out.println("What was your GPA @ school/college?: ");
		GPA = input.nextDouble();
		
		System.out.println("How many miles do you drive to school every day?: ");
		Drive = input.nextDouble();
		
		
		
		
		
		
		
		
		
	}


}
