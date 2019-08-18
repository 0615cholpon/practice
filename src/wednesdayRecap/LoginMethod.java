package wednesdayRecap;

import java.util.Scanner;

public class LoginMethod {
	public static void main(String[] args) {
	 
		login("johnJava", 123456);
	}
	public static void login(String expectedId, int expectedPassword) {
		System.out.println("You have clicked to login button!");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter account name: ");
		String accountName = input.nextLine();
		System.out.println("Please enter password:");
		int password = input.nextInt();
		input.nextLine();
		
		if(accountName.equals(expectedId)) {
			if(accountName.equalsIgnoreCase(expectedId) && password == expectedPassword) {
				System.out.println("Login successful!");
			}
			
		}else {
			System.out.println("Either your password or your accountId is nont correct!");
		}
	}

}
