package Constructors;

import java.util.Scanner;

public class PhoneTester {
	public static void main(String[] args) {
		//Phone p1 = new Phone("Samsung", "white", 4, true);
		
//		Phone p2 = new Phone("PhoneX", "black");
//		p2.text(1234567890, "Hello");
//		p2.call(12345678);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your phone model: ");
		String model = input.nextLine();
		System.out.println("Please enter color of the phone: ");
		String color = input.nextLine();
		Phone p3 = new Phone(model, color);
		System.out.println("Please enter phone number to call: ");
		long phoneNum = input.nextLong();
		p3.call(phoneNum);
	}

}
