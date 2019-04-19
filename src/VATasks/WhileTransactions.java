package VATasks;

import java.util.Scanner;

public class WhileTransactions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your balance?");
		double balance = input.nextDouble();
		int counter = 0; 
		
		while(balance > 0) {
			counter++;
			System.out.println("What is your transaction #" + counter + " amount?:");
		   double transaction = input.nextDouble();
		   if(transaction > balance) {
			   System.out.println("Warning, your balance is going to go to negative due to this transaction");
		   }
		   
		   balance -= transaction;
		   System.out.println("Your current balance is " + balance);
		
		
		}
		System.out.println("You don't have sufficient funds for any more transactions" + balance);
		System.out.println("You have successfully made " + counter + " transactions!");
	}
	}


