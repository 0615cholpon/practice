package Arrays;

import java.util.Scanner;

public class Names {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the keyword: ");
		String keyword = input.nextLine().toLowerCase();
		
	
		String[]names = {"James", "John", "Adam", "Elize", "Jamie", "Benzema"};
		for(int i = 0; i < names.length; i++) {
			if(names[i].toLowerCase().contains(keyword)) {
			//char firstLetters = names[i].charAt(0);
			System.out.println(names[i]);
		}
	}
	}
}
