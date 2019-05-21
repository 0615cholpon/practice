package replit;

import java.util.Scanner;

public class PalindromeAnotherVersion {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter area code:");
//		int area = input.nextInt();
//		input.nextLine();
//		
//		System.out.println("Local number:");
//		int local = input.nextInt();
//		
//		System.out.println("calling number" + " " + "(" + area + ")" + local);
		
		String name = "civic";
		int counter = 0;
		
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) != name.length() - 1 - i);
			counter++;
		}
		if(counter > 0) {
			System.out.println("Palindrome!");
		}else {
			System.out.println("Not Palindrome!");
		}
		
	}

}
