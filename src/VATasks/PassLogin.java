package VATasks;

import java.util.Scanner;

public class PassLogin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your username: ");
		String username = input.nextLine();

		System.out.println("Please enter your password: ");
		String passwd = input.nextLine();
		String ValidUsername = "cshabolotova@gmail.com";
		String ValidPasswd = "WoodenSpoon123";

		if(username.equals(ValidUsername) && passwd.equals(ValidPasswd)) {
			System.out.println("Login Successful, Welcome!");
		}else if(!username.equals(ValidUsername) && !passwd.equals(ValidPasswd)) {
			System.out.println("Invalid Username & Invalid Password!");
		}else if(username.equals(ValidUsername) && !passwd.equals(ValidPasswd)) {
			System.out.println("Invalid Password!");
		}else {
			System.out.println("Invalid username!");
		}

	}
}
