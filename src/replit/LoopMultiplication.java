package replit;

import java.util.Scanner;

public class LoopMultiplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any positive number: ");
		int num = input.nextInt();
		
		for(int i = 1; i <= 10; i++) {
		//int  enteredNum = input.nextInt();
		System.out.println(num * i);
		}
		
	
	}

}
