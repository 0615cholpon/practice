package IfElseStatement;

import java.util.Scanner;

public class CampusTimes {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int time;
		boolean campusOpen;
		
		System.out.println("Please enter time to check the campus hours: ");
		time = input.nextInt();
		
		if(time >= 0 && time <24 ) {
			if (time >= 8 && time <24){      //nested method;
				campusOpen = true;	
		}
		else {
			campusOpen = false;	
		} 
			System.out.println("Campus open: " +campusOpen);	
	}
	else {
		System.out.println("Invalid time. Try again!");
		
	}
	


}
}