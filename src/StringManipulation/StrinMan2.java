package StringManipulation;

import java.util.Scanner;

public class StrinMan2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String name;
		System.out.println("Please enter the name: ");
		name = input.nextLine().trim();
		name = name.toLowerCase();
		System.out.println("Name: " + name);
	    int l = name.length();
	    
          if(name.isEmpty()) {
			
			System.out.println("Invalid name");
		} else 
		{
		char first = name.charAt(0);
		char last = name.charAt(l-1);
		boolean check = true;
		
		if (first == 'a' && last == 'z') {
			System.out.println("Cool!");
		
		}else {
			System.out.println("not cool");
		}
	}
	}
}

