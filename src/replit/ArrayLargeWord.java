package replit;

import java.util.Scanner;

public class ArrayLargeWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		
		for(int j = 0; j < 5; j++) {
			words[j] = input.nextLine();
		}
		 
		String LW = words[0];
		for(int i = 0; i < words.length;  i++) {
		 
		  if(words[i].length() > LW.length()){
			    LW = words[i];	   
			  }
		  
	}
		 System.out.println(LW);
	}

}
