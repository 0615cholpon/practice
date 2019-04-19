package Inputs;

import java.util.Scanner;

public class Cybertek {
	
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner (System.in);
		
	System.out.println("Welcome to time calculator!!!\n");
	System.out.println("Please enter total seconds: ");
	int Seconds = input.nextInt();
	int minutes = Seconds/60;
	int remainingSeconds = Seconds % 60;
	int hours = minutes/60;
	int remainingMinutes = minutes % 60;
	
	
	
	System.out.println(Seconds + " seconds converted into:");
	System.out.println(hours + " hours");
	System.out.println(remainingMinutes + " minutes");
	System.out.println(remainingSeconds + " seconds");
	
	
	



	
	
	

		
		
		
		
		
		
		
	}

}
