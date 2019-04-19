
package replit;

import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		  
	    int positive = 0;
	    int negative = 0;
	    int zero = 0;
	    String YesOrNo = "";
	 
	    do{
	      System.out.println("Enter the number: ");
	      int number = input.nextInt();
	      input.nextLine();
	      
	       if(number > 0){
	       positive++;
	    }else if(number < 0){
	      negative++;
	    }else{
	      zero++;}
	       System.out.print("Do you want to continue y/n?");
	       YesOrNo = input.nextLine();
	       
	    }
	    while(YesOrNo.equals("y")); 
	      System.out.println("Positive numbers: " + positive);
	      System.out.println("Negative numbers: " + negative);
	      System.out.println("Zero numbers: " + zero);
	               
	    	


	    
}
}