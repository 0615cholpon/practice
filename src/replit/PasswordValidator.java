package replit;

import java.util.Scanner;

public class PasswordValidator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your password: ");
		String password = input.nextLine();
		int length = 8;
		int capLetter = 0; 
		int lowLetter= 0;
		int digits = 0;
		int spChars = 0;

		
for(int i = 0; i < password.length(); i++) {
if((password.charAt(i) >= 65 && password.charAt(i) <= 90) || 
(password.charAt(i) >= 97 && password.charAt(i) <= 122) || (password.charAt(i) >= 48 && password.charAt(i) <= 57) ||
(password.charAt(i) >= 33 && password.charAt(i) <= 47 && password.charAt(i) >= 58 && password.charAt(i) <= 64 &&
password.charAt(i) >= 92 && password.charAt(i) <= 96 && password.charAt(i) >= 123 && password.charAt(i) <= 126)) {
}
if(password.charAt(i) >= 65 && password.charAt(i) <= 90) {
	capLetter++;
}
if(password.charAt(i) >= 97 && password.charAt(i) <= 122) {
	lowLetter++;
	
}
if(password.charAt(i) >= 48 && password.charAt(i) <= 57) {
	digits++;
}
if(password.charAt(i) >= 33 && password.charAt(i) <= 47 && password.charAt(i) >= 58 && password.charAt(i) <= 64 && 
password.charAt(i) >= 92 && password.charAt(i) <= 96 && password.charAt(i) >= 123 && password.charAt(i) <= 126 ) {
	spChars++;
	
}
	System.out.println("Password is accepted");
	}

if(length < 8) {
	System.out.println("Password should contain minimum 8 characters");
}
if(capLetter < 1) {
	System.out.println("Password should contain at least 1 uppercase letter");
}
if(lowLetter < 1) {
	System.out.println("Password should contain at least 1 lowercase letter");
}
if(digits < 1) {
	System.out.println("Password should contain at least 1 digit");
}
if(spChars < 1) {
	System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,. ");
}
	}

}
