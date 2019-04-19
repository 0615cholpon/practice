package StringManipulation;

import java.util.Scanner;

public class replIt {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter two words: ");
		 String n1 = input.nextLine();
		 String n2 = input.nextLine();
		 
	
		char lastLetter = n1.charAt(n1.length()-1);
		//System.out.println(lastLetter);
		
		char firstLetter = n2.charAt(0);
		int a = n2.indexOf(firstLetter);
		
		
		if(lastLetter==firstLetter) {
			String b = n2.substring(a + 1);
			System.out.println(n1 + b);
		}
	
	
	
	
	
	}

}
