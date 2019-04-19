package VATasks;

import java.util.Scanner;

public class PhoneNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your area code: ");
		int areaCode = input.nextInt();
		
		System.out.println("Please enter your local number: ");
		int localNum = input.nextInt();
		
		String PhoneNumber = "(" + areaCode + ")-" + localNum;
		System.out.println(PhoneNumber);
		System.out.println("Calling number" + " " + PhoneNumber );
		
		
	}

}
