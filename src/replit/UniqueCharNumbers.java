package replit;

import java.util.Scanner;

public class UniqueCharNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter word: ");
		String word = input.nextLine();
		
		int wordLength = word.length();
		String result = "";
		int counter = 0;
		
		for (int i = 0; i < wordLength; i++) {
			String a = word.charAt(i) + "";
			
			if(!result.contains(a)) {
			for (int k = 0; k < wordLength; k++) {
				String b = result.charAt(k) + "";
				
		if(a.equals(b)) {
			counter++;
			result += a;
		}	
		}
			System.out.print(a + ":" + counter + " ");
			counter = 0;
	}

	}
	}
}
