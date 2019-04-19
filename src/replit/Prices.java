package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Prices {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//int [] numbers = {5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2};
	    
	    int num[]= {5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2};
	    
	    for(int i =0;i<num.length;i++)
	     {
	         boolean isDistinct=false;
	         for(int j=0;j<i;j++)
	         {
	             if(num[j]==num[i])
	             {
	                 isDistinct=true;
	                 break;
	             }
	         }
	         if(!isDistinct)
	         {
	             System.out.print(num[i]+" ");
	         }
	     }
		
		
		
		
		
		
		
		
		
	    }	
	}
	