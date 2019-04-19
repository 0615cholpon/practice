package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MyLibrary {
	public static void main(String[] args) {
		String [] books = {"Gone with the wind", "Running Kite", 
				"Three Comrades", "Becoming", "Unbeatable Minds"};
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the book to replace:");
		String replaceBook = input.nextLine();
		System.out.println("Please enter the new book:");
		String newBook = input.nextLine();
	     
//		Arrays.sort(books);
//	    int result = Arrays.binarySearch(books, "Unbeatable Minds");
//	    System.out.println(result);
//	    books[4] = newBook;
//		System.out.println(Arrays.toString(books));
//		Arrays.sort(books);
//		System.out.println(Arrays.toString(books));
		
	//============= ANOTHER WAY=====================
		
Arrays.sort(books);
int result = Arrays.binarySearch(books, replaceBook);
if(result >= 0) {
	books[result] = newBook;
}
		System.out.println(Arrays.deepToString(books));
		Arrays.sort(books);
		System.out.println(Arrays.deepToString(books));
		}
	}


