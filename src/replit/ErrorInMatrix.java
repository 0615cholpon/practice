package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ErrorInMatrix {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    String[][] arr = new String[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.next();
	      }
	    }
	    
	    //your code here
	    //int [] newArr = new int[arr.length];
	    for(int i = 0; i < arr.length; i++) {
	    	for(int j = 0; j < arr[i].length; j++) {
	    		if(j % 2 == 0) {
	    			arr[i] = arr[j];
	    		
	    		}else {
	    			arr[i] = arr[j];
	    		}
	    	}
	    }
	 
	    
	  
	    System.out.println( Arrays.deepToString(arr) ) ;
	  }

}
