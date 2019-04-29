package replit;

import java.util.Arrays;

public class CountWords {
	public static void main(String[] args) {
		System.out.println(wordCount(" chopa school home  "));
	}
	  public static int wordCount(String words) {
		  words = words.trim();
		  String []totalWord = words.split(" ");
		return totalWord.length;

	  }
}
