package Arrays;

import java.util.Arrays;

public class SplitMethod {
	public static void main(String[] args) {
	// split() --> split the string with the given character and returns string array
	
String s = "Hellopeopleoutthere";
String words [] = s.split("p");		
	System.out.println(Arrays.toString(words));	
	}
}
