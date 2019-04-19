package replit;

import java.util.Scanner;

public class PositiveNegativeZeros {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);
	  } 
	  public static void plus_minus(int [] numbers){
	    int positives = 0;
	    int negatives = 0;
	    int zeros = 0;
	    for(int i = 0; i < numbers.length; i ++){
	      if(numbers[i] > 0){
	        positives++;
	        
	      }else if(numbers[i] < 0){
	        negatives++;
	        
	      }else if(numbers[i] == 0){
	    	  zeros++;
	      }
	    }
	    System.out.println("Positives:" + positives + ", " + "Negatives:" + negatives + ", " + "Zeros:" + zeros);
	  }
	  
	  
	  
	
	}


