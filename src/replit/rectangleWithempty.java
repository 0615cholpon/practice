package replit;

import java.util.Scanner;

public class rectangleWithempty {
	public static void main(String[] args) {
   for(int i = 1; i < 5; i++) {
	   for (int k = 1; k < 7; k++) {
		   if(i == 2 || i == 3) {
			   if(k >= 2 && k <= 5) {
				   System.out.print(" ");
				   continue;
			   }   
		   }
		   System.out.print("*");
	   }
	   System.out.println();
   }
		
		
	}

}
