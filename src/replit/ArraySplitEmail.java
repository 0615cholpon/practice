package replit;

import java.util.Scanner;

public class ArraySplitEmail {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("Please enter your email:");
		    String email = input.nextLine();
		    
	int counter = 0;  
		  for (int i = 0; i < email.length(); i ++) {
			  if(email.charAt(i) == '@') {
				  counter++;
			  }
		  }
		 if(counter == 1) {
			 String [] splitEmail = email.split("@");
			 System.out.println("Id: " + splitEmail[0]);
			 System.out.println("Domain name: " + splitEmail[1]);
			 
		 }else {
			 System.out.println("Invalid email!");
		 }
		  
		  
	}

}
