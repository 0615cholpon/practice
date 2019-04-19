package IfElseStatement;

import java.util.Scanner;

public class GroupAssignmentIfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
	System.out.println("Please enter the unit price: ");
	int unitPrice = input.nextInt();
	
	System.out.println("Please enter quantity: ");
	int quantity = input.nextInt();
	
	if (quantity > 100 && quantity <= 120) {
		int GrandTotal = unitPrice * quantity; 
		int discount = 10;
		 int discountApplied = GrandTotal * 10/100;
		 int Total = GrandTotal - discountApplied;
		 
		 System.out.println("Grand Total: " + GrandTotal);
		 System.out.println("Discount: 10%");
		 System.out.println("Discount Applied: " + GrandTotal * 10/100);
		 System.out.println("Total: " + Total);
		
	}
	else if (quantity < 120) {
		int GrandTotal = unitPrice * quantity; 
		int discount = 15;
		 int discountApplied = GrandTotal * 15/100;
		 int Total = GrandTotal - discountApplied;
		 
		 System.out.println("Grand Total: " + GrandTotal);
		 System.out.println("Discount: 15%");
		 System.out.println("Discount Applied: " + GrandTotal * 15/100);
	 System.out.println("Total: $ " + Total);
	}	
	
	int quarters, dimes, nickle, change;
	int price=0;
	System.out.println("Please enter price in cents: ");
	price = input.nextInt();
	change = 100 - price;
	quarters = change/25;
	change = change%25;
	
	dimes = change/10;
	change = change%10;
	
	nickle = change / 5;
	change = change % 5;
	
	System.out.println("Your change is " + quarters  + " quarters" + ", "  + dimes + " dimes" + "," + " and " + nickle + " nickle");
	
	
	int numberOfCalls;
	System.out.println("Enter number of calls: ");
	numberOfCalls = input.nextInt();
	
	 double bill = 0;
	 
	 if (numberOfCalls <= 100) {
		 bill = 200;
	 }
	 else if(numberOfCalls >100 && numberOfCalls <= 150) {
		bill = 200 + (numberOfCalls-100)* 0.6;
	 }
	 else if(numberOfCalls > 150 && numberOfCalls <= 200) {
		 bill = (200 +  (50* 0.6)+(numberOfCalls - 150)* 0.5);
		 }
	 else if(numberOfCalls >200) {
		 bill = 200 + (50*0.6)+ (50*0.5)+(numberOfCalls-200)*0.4;
	 }
	 System.out.println("Your bill is: $" + bill);
	 }

	}

