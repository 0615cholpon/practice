package StringManipulation;

import java.util.Scanner;

public class NameValidation {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	//String name = "Lawrence";
	
	//name.contains("w"); //returns boolean.
	                    //when we store it we need to store it in boolean variable;
	
	//boolean check = name.contains("aw");
	//System.out.println(check); 
	
	// " " is considered to be character.
	// String name = "Lawre nce";
	 // name.contains( " ") is considered to be correct!
	
	// .contains --> case-sensitive;
	// if we have lower & upper cases we can convert to either Upper or lower cases;
	
	// if we are looking for " mark in the text. we need to write "\"" and search for this mark.
	
	String multipleword;
	boolean hasMultipleWords = false;
	
	System.out.println("Please enter multiple words:");
	multipleword = input.nextLine();
	multipleword = multipleword.trim();
	boolean check = multipleword.isEmpty();
	
	if (multipleword.isEmpty()) {
		System.out.println("Please provide some data");	
	}else { 
		if(multipleword.contains(" " )) {
		hasMultipleWords = true;	
	}
	else {
		hasMultipleWords = false;
	}
	System.out.println("Multiple words: " + hasMultipleWords);
	
	
	
	
	}	
	
}
}
