package wednesdayRecap;

import java.util.Arrays;
import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
	countWords();
	}
	public static void countWords() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence to be analyzed: ");
		String sentence = input.nextLine();
		
		String [] convert = sentence.split(" ");
		System.out.println("Words in this string are as followed: " + Arrays.toString(convert));
		System.out.println("The number of words in this sentence is: " + convert.length);
				
	}

}
