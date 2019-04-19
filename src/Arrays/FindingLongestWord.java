package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindingLongestWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		
		for(int i = 0; i < 5;  i++) {
			  
			  words[i] = input.nextLine();
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
		
		int LastWord = words.length - 1;
		System.out.println(words[LastWord]);
		
		if(words[LastWord].equals(words[i])) {
			System.out.println(words[LastWord]);
			
			
		}
	
		
	}
	}
}
