package Arrays;

import java.util.Arrays;

public class TreeWithLeasttoMax {
	public static void main(String[] args) {
		String word = "Write a program that createsard a group of given size";
	
		String [] NumOfWords = word.split(" ");
		for(int n = 1; n < 13; n++) {
		for(int i = 0; i < NumOfWords.length; i++) {
			if(NumOfWords[i].length() == n ) {
				System.out.println(NumOfWords[i]);
			}	
		}	
	}
		int maxLength = 0;
		for(String Word: NumOfWords) {
			if(NumOfWords.length > 0) {
				maxLength = NumOfWords.length;
			}	
		}
		System.out.println(maxLength);
	}
}
