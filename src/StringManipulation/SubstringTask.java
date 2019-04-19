package StringManipulation;

import java.util.Scanner;

public class SubstringTask {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
// Print "cool" if account starts w/h 2;
// Print "not cool" if account starts w/h 5;

		//String s = "Your account number: 2353456677DCCD";
		// int firstDigit = s.indexOf(":") +2
		
		//if(s.charAt(21) == '2') {
		// we can change 21 to "i" and add 2 and will read from two;
		//	System.out.println("Cool!");
		//}
		//else {
		//	System.out.println("Not cool!");
		//}	
		// Write a task  that takes just account # (only #s) from the String
		// in the format below.
		// Note: account length is 6 if account starts with 2.
		// Account length is 5 if account  starts with 5
	// Ex: Your account number: 257389ACCD
	// Ex: Your account number: 52317XYZ
		
		String s = "account number: 5353456677DCCD";
	    boolean check = s.startsWith("5", 16);
	  // OR STRING S = "535355555627283";
	  // BOOLEAN CHECK = S.STARTSWITH ("2");
	    System.out.println(check);
	
	if (check) {
		System.out.println("Cool!");
	}
	else {
		System.out.println("Not cool!");
	}
    
	
	
	
	
    
		
	}

}
