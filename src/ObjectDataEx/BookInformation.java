package ObjectDataEx;

import java.util.Scanner;

public class BookInformation {
	public static void main(String[] args) {
		Book kitep = new Book();
		Scanner input = new Scanner(System.in);
		System.out.println("How many books you want? ");
		int num = input.nextInt();
		input.nextLine();
		
		Book [] total = new Book [num];
		
		for(int i = 0; i < num; i++) {
			
			System.out.println("Enter title for book " + (i + 1));
			kitep.title = input.nextLine();
			System.out.println("Enter author of the book " + (i + 1));
			kitep.author = input.nextLine();
			System.out.println("Enter pages for book " + (i + 1));
			kitep.pages = input.nextInt();
			input.nextLine();
			total[i] = kitep;
		}
		System.out.println(total.length);
		
	}

}
