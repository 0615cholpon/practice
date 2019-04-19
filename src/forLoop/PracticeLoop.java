package forLoop;

import java.util.Scanner;

public class PracticeLoop {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Please enter two numbers: ");
String numbers = input.nextLine();

int index = numbers.indexOf(" ");
//System.out.println(index);

	String number1, number2;
	number1 = numbers.substring(0, index);
	number2 = numbers.substring(index+1);
		System.out.println(number1 + " " + number2);
//		
   int num1, num2;
	num1 = Integer.valueOf(number1);
	num2 = Integer.valueOf(number2);
	
	if(num1 < num2) {
		for (int i = num1; i <= num2; i++) {
			System.out.println("Step " + i);
		}
	}else if(num1 > num2) {
		for(int i = num1; i >= num2; i--) {
			System.out.println("Step " + i);
		}
	}
	else {
		System.out.println("Numbers should be different!");
	}
	
        int  counter = num1;
		while(num1 < num2) {
			System.out.println("Step ");
			
		}

	}

}
