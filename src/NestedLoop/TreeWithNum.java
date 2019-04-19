package NestedLoop;

import java.util.Scanner;

public class TreeWithNum {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		 System.out.print("Please enter guest name:");
		    String name = input.nextLine();
		    String yesOrNo = "";
		    
//		    do{
//		      System.out.println("Do you want to enter new guest name: ");
//		      String newGuest = input.nextLine();
//		}
		   do {
		    
		      System.out.println("Do you want to enter new guest name: ");
		      String addName = input.nextLine();
		      break;
		      
		   } while(yesOrNo.equals("yes")); 
		   System.out.println("Please enter guest name: ");
		      String GuestName = input.nextLine();
			   
			  
		   
		    }
	}


