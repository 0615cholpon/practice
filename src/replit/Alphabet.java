package replit;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  System.out.println("Input an alphabet:");
      String str = input.next() .toLowerCase();
      
	int strLength = str.length();
  
    
    for (int i = 0; i < strLength; i++) {
    	char ascii = str.charAt(i);
    if(strLength > 1) {
        System.out.println("ERROR. It should be exactly 1 length character");
        break;
    	}
    if(ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117  ) {
    	System.out.println("Vowel");
    }else if (ascii >= 98 || ascii <= 100 || ascii >= 102 || ascii <= 104 || ascii >= 106 || ascii <= 110 || ascii >= 112 || ascii <= 116 || ascii >= 118 || ascii <= 122)
    	System.out.println("Consonant");
    } 
	}
}
