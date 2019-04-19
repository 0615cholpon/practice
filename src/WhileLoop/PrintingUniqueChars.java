package WhileLoop;

import java.util.Scanner;

public class PrintingUniqueChars {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.println("Please enter the word: ");
	String word = input.nextLine().toLowerCase() .replace(" ", "");
	//System.out.println(word);
	
// Read the String and store into String variable 
// Convert all string to LC so it ignores the cases
// Replace white  spaces with empty String
// Run for loop for each character of the String
// Keep adding the characters to result also keep checking if result already
	//contains the character.
// print the result;
//Note: use charAt(); 
	int length = word.length();
	String result = "";
	
	for (int i = 0; i < length; i++) {
		char letters = word.charAt(i);
	if (result.contains(letters + "")) {
		continue;
	}
		result += letters;
		
	}
	System.out.println(result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
