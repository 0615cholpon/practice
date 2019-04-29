package replit;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int []num1 = {1, 2, 3};
		int []num2 = {4, 5, 6};
		System.out.println(Arrays.toString(mergR(num1, num2)));
		
	}
	public static int[] mergR(int[] a,int[] b) {
		
	    int [] retArr = new int [a.length + b.length];
	    for(int z = 0; z < retArr.length; z++) {
	    	for(int i = 0; i < a.length; i++) {
	    		retArr[z] = a[i];
	    		z++;
	    	}
	    	for(int j = 0; j < b.length; j++) {
	    		retArr[z] = b[j];
	    		z++;
	    	}
	    }
		 return retArr;  
	    
	  }

}
