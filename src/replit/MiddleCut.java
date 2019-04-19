package replit;

import java.util.Scanner;

public class MiddleCut {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Please enter word: ");
String word = input.nextLine();

int length = word.length();

if(length%2 == 1 ) {
	int middle = length /2;
	String middleCut = word.substring(middle, middle +1);
	System.out.println(middleCut);
	
}

		
	}

}
