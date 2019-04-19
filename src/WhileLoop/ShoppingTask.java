package WhileLoop;

import java.util.Scanner;

public class ShoppingTask {
	public static void main(String[] args) {
// Write a program that keeps asking for the transaction amount from user 
// while user has sufficient amount of money.
// variables: balance, transactionAmount.
		Scanner input = new Scanner (System.in);
		
	int balance = 1500;
	int transactionAmount;
	
	while(balance > 0) {
		System.out.println("Please enter the transaction amount: ");
		transactionAmount = input.nextInt();
		
		input.nextLine();
		System.out.println("Please enter the item name: ");
		String itemName = input.nextLine();
	
		if (itemName.equalsIgnoreCase("AK-47")) {
			System.out.println("Illegal item!");
			break;
		}
		
		if(balance < transactionAmount) {
			System.out.println("Transaction amount is too high! Try lower price!");
			continue;
		} 
		balance -= transactionAmount;
		System.out.println(itemName + " is purchased successfully!");
		}
        if (balance == 0) {
        	System.out.println("You are broke!");
        }
        System.out.println("Your balance: " + balance);
	}
	
	}
	

//		if (transactionAmount > balance) {
//			System.out.println("Your transcation amount is too high! Try lower price!");
//			continue;
//		} 
//		balance =balance- transactionAmount;
//		
//	}
//	if (balance == 0) {
//		System.out.println("You are broke!");
//		
//	}	
//	System.out.println("Your balance: " + balance);
//	}	
//}
		
//	do {System.out.println("Please enter the transaction: ");
//	transactionAmount = input.nextInt();
//	balance -= transactionAmount;
//	}
//	while(balance > 0);
//	System.out.println("You are broke!");

		
	////////////////////////////////////

// Print "Transaction amount is too high" and break the loop
// if transaction amount is going to put balance to negative;
			
			
		
	


