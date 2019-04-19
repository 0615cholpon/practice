package forLoop;

import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		for (int num1 = 0; num1 < 20; num1++) {
//			
			System.out.println(num1);
			if (num1 == 13) {
				continue;	
			}
			System.out.println("Something!" );
		}
// write a program named "RacistPerson. Ask the name from the user and 
// print "good job, % username" except the James.
		
		for (int num1 = 7; num1 >4; num1++ ) {
			Scanner input = new Scanner (System.in);
			System.out.println("Please enter the name: ");
			
			String name = input.nextLine();
			
		if(name.contains("James")) { //equalsignoreCase("James")
			continue;
		
		}
		else {
			System.out.println("Good job, " + name);
		}
		}
		
	}

}
