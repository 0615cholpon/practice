package StringManipulation;

import java.util.Scanner;

public class ifBoolean {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter name1: ");
		String fullName1=input.nextLine() .toLowerCase ();
		int space = fullName1.indexOf(" ");
		String ab = fullName1.substring(space);
		
		String fullName2;
		System.out.println("Please enter name2: ");
		fullName2 = input.nextLine() .toLowerCase();
		int space2 = fullName2.indexOf(" ");
		String abc = fullName2.substring(space2);
		
	
		boolean relative;
		
	if(ab.equals(abc)) {
			relative = true;
		System.out.println("Relative: " + relative);
		}
		else {	
			relative = false;
		System.out.println("Relative: " + relative);
		}
		
		
	}

}
