package replit;

import java.util.Scanner;

public class personalInfoSplit {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	  }
	  
	   public static void person(String info) 
		{
		 
		   String [] sepInfo = info.split(",");
			
			for(int i = 0; i < sepInfo.length; i++) {
				System.out.println("First name:" + sepInfo[0] + " ");
			}
			
		
		}//end person
	  
	}
	


