package NestedLoop;

import java.util.Scanner;

public class PhoneValidator {
	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("Please enter the phone number: ");
String  phoneNum = input.nextLine();
		
int PhoneNumLength = phoneNum.length();
boolean check = true;
		
if(!(PhoneNumLength == 10 || PhoneNumLength == 12)) {
System.out.println("Invalid length - must be either 12 or 10 characters.");
		
}else if(PhoneNumLength == 12){
	check = false;
	if(!(phoneNum.charAt(0) == '(' && phoneNum.charAt(4) == ')')) {
		check = false;
		System.out.println("Invalid format");
	}
}
	phoneNum = phoneNum.replace("(", "");
	phoneNum = phoneNum.replace(")", "");
	if(PhoneNumLength == 10) {
		for (int i = 0; i < PhoneNumLength; i++) {
			char c = phoneNum.charAt(i);
			int ii = c;
			if(ii < 48 || ii > 57) {
				System.out.println("Must be number between 0-9");
				break;
			}
		}
		
	}
	if(check)
	System.out.println("Valid Phone Number");
//	System.out.println("Invalid format, there is no closing paranthesis!");
//	
//} else if(PhoneNumLength == 12) {
//	System.out.println(phoneNum.replaceAll("(", ""));
//	
//}else if (PhoneNumLength == 12) {
//	System.out.println(phoneNum.replaceAll("(", ""));
//}
//	//for (int i = 0; i < 9; i++) {
//		
	}
}

		
		
		
		
	


