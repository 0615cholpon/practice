package replit;

import java.util.Scanner;

public class EmailValidArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email:");
		String email = input.nextLine();
		
		
			if(email.contains("@")) {
				int at = email.indexOf("@");
				String id = email.substring(0, at);
				String domainName = email.substring(at);
		System.out.println("Id: " + id);
		System.out.println("Domain Name: " + domainName);
	}
		}
}
