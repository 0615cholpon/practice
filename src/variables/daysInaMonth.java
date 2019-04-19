package variables;

import java.util.Scanner;

public class daysInaMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int number=0;
		String month;
		int days = number/30;
		System.out.println("Please enter your the month: ");
		month = input.nextLine();
		
		System.out.println("In this month we have: " + days + "days");
		
		
	}

}
