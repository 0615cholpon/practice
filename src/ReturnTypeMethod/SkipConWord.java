package ReturnTypeMethod;

import java.util.Scanner;

public class SkipConWord {
	public static void main(String[] args) {
		String n = "concert day";
		System.out.println(skipCon(n));	
	}
// Write a method part II
// Method should accept 2 Strings;
// 1 data. 2 String we want to remove(3letters);
// Every single rules for the previous version is same for this method too

	public static String skipCon(String word) {
		word = word.toLowerCase().trim();
		
		if(word.contains(" ") || word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}
		if(word.contains("con")) {
			return word.replace("con", "");
		}else {
			return word;
		}
		
	}

}
