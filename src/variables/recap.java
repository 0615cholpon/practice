package variables;

import java.util.Scanner;

public class recap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word:");
		String word = input.nextLine();
		
		String revWord = "";
		int lastIndex = word.length()-1;
//for(int i = lastIndex; i >= 0; i--) {
//	char letter = word.charAt(i);
//	revWord += letter;
//}
//if(revWord.equals(word)) {
//	System.out.println("Palindrome!");
//}else {
//	System.out.println("Not Palindrome!");
//}
		while(lastIndex >= 0) {
			revWord += word.charAt(lastIndex);
			lastIndex --;
		}
		if(revWord.equals(word)) {
			System.out.println("Palindrome!");
		}else {
			System.out.println("Not Palindrome!");
		}
	}

}
