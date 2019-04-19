package forLoop;

import java.util.Scanner;

public class CharCounter {
	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);

System.out.println("Please enter your word: ");
String word = input.nextLine() .toLowerCase();

System.out.println("Please enter character: ");
char character = input.nextLine().toLowerCase() .charAt(0);
System.out.println(word);
System.out.println(character);

int counter = 0;
for(int i = 0; i < word.length(); i ++) {
	if(character == word.charAt(i)) {
		counter++;
	}
}
System.out.println(counter);	
	
}



	}
	


