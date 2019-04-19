package VATasks;

import java.util.Scanner;

public class GiveMe5$ {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dollar = 0;
		while(dollar != 5) {
			System.out.println("Give me $5.00: ");
			dollar = input.nextInt();
			
		}
		System.out.println("Thank you for $5.00");
	}

}
