package WhileLoop;

import java.util.Scanner;

public class WhileLoopMOnday {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	System.out.println("Please enter your number: ");
	String numbers = input.nextLine();
	
	int lengthNum = numbers.length();
	if(lengthNum > 3) {
		String result = ("$" + numbers.substring(0, lengthNum - 3)+ ","
				+ numbers.substring(lengthNum - 3) );
		System.out.println("Result is: " + result);
	}
		
	else {
		System.out.println("Must be more than three digits!");
	}
	
	
	

		
		
		
		
		
		
		
	}

}
