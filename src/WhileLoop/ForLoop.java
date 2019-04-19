package WhileLoop;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please print your word: ");
		String word = input.nextLine();
	int LastIndex = word.length()-1;
	
	for (int i = LastIndex; i >= 0; i--) {
		System.out.println(i);
	}
	
	}

}
