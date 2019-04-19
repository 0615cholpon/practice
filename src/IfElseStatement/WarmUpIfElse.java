package IfElseStatement;

import java.util.Scanner;

public class WarmUpIfElse {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	int a;
	int b;
	int c;
	
	System.out.println("Please enter 3 integers: ");
	a = input.nextInt();
	b = input.nextInt();
	c = input.nextInt();
	
	if (a > b && a> c) {
		System.out.println("Max number of " + a + ", " + b + ", and " + c + " is: " + a);
	}
	else if (b > a && b > c) {
		System.out.println("Max number of " + a + ", " + b + ", and " + c + " is: " + b);
	
	}
	
	else if (a==b && b==c && c==a){
		System.out.println("All integers are equal!");
	}
	else if (c > a && c > b) {
		System.out.println("Max number of " + a + ", " + b + ", and " + c + " is: " + c);
	}
	
	
	double num1, num2, result = 0;
	boolean invalidOperator = false;
	System.out.println("Please enter two double values: ");
	
	num1 = input.nextDouble();
	num2 = input.nextDouble();
	
	
	//boolean invalidOperator = false;
	
	//String numbers = input.nextLine();
	System.out.println("Please choose operator from below options: +, -, *, /");
	String operator = input.next();
	

	
switch (operator) {
case "+" :
	result = (num1 + num2);	
	break;
case "-":
	result = (num1 - num2);
	break;
case "*":
result = (num1 * num2);
	break;
case "/":
	result = (num1 / num2);
	break;
default:
	invalidOperator = true;
	System.out.println("Invalid operator. Try again!");
	
if(invalidOperator == false) {
System.out.println("Result of "+ num1 + " + " +  + num2 +  " is " + result);
}
}	
}

}
