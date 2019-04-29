package replit;

import java.util.Arrays;

public class PopulateArray {
	public static int[] populate(int[] r) 
	{
		int [] newArr = new int [r.length];
		int counter = 1;
		int num = 0;
		for(int i = 0; i < r.length; i ++) {
			//counter = 1;
			if(counter != r[i]) {
				
				newArr[i] = counter;
				counter++;
			}
		
		}
		return newArr;
		
	}
	
	public static void main(String[] args) 
	{
	 
	  
    int [] i= new int[4]; 
    i= populate(i) ;
    System.out.println(Arrays.toString(i));

	}

}
