package replit;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 //System.out.println();
 String sentence = input.nextLine();
		String revSentence = "";
		    String [] reversedSentence = sentence.split(" ");
		    for(int i = reversedSentence.length-1; i >= 0; i--) {
		    	revSentence += reversedSentence[i] + " ";
		    }
		  System.out.println(revSentence.substring(0, revSentence.length()-1));  
	}

}
