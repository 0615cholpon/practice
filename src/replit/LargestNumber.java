package replit;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    int[][] arr = new int[rows][cols];
		    for(int i=0 ;i<=rows-1;i++)
		    {
		      for(int j=0 ;j<=cols-1;j++)
		      {
		        arr[i][j]=inp.nextInt();
		      }
		    }
		   
		  
		   int maxValue = 0;
	
		   for(int i = 0; i < arr.length; i++){
			   for(int k = 0; k < arr[i].length; k++) {
				   if(arr[i][k] > maxValue) {
						  maxValue = arr[i][k];  
					  } 
			   }
			 
		   }
              System.out.println(maxValue);
		   
		   

	 }
}
