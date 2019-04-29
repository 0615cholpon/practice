package ObjectDataEx;

import java.util.Arrays;
import java.util.Scanner;

public class BookInfo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter total books: ");
		int numBooks = input.nextInt();
		input.nextLine();
		
		int [] sumBook = new int [numBooks];
		int counter = numBooks;
		
		int count = 1;
		boolean check = true;
		
		while(check) {
			if(counter != numBooks) {
				System.out.println("Please enter title for book " + count + ":");
				
				String title = input.nextLine();
				System.out.println("Please enter pages for book " + count + ":");
				int pages = input.nextInt();
				input.nextLine();
				System.out.println("Please enter the author of book " + count + ":");
				String author = input.nextLine();
				count++;
				
			}else {
				System.out.println();;
			}
			
			
		}
		System.out.println(Arrays.toString(sumBook));
		
	}

}
