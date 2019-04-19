package replit;

import java.util.Scanner;

public class positiveNegative {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {
	        arr[i]=inp.nextInt();
	    }
	    //#2 Your code here
	   isPos(arr);
	    
	  
	  }
	  
	  public static void isPos(int [] num)
	  { 

		  for(int i = 0; i < num.length; i++) {
			  if(num [i] > 0) {
				  System.out.println("positive");
			  }else {
				  System.out.println("negative");
			  }
		  }
		  
	  }
	    
	    }
	    //#1 your code here
	   
	  
	


