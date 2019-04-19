package Methods;

import java.util.Arrays;

public class integerArray {
	public static void main(String[] args) {
	int [] nums = {23, -1, 3, -2};
	System.out.println(Arrays.toString(nums));
	negativeArray(nums, 100);
	}
	public static void negativeArray(int [] negativeArray, int substitute ) {
		for(int i = 0; i < negativeArray.length; i++) {
			if(negativeArray[i] < 0) {
				negativeArray[i] = substitute;
				
			}
			
		}
		System.out.println(Arrays.toString(negativeArray));
	}	
	}


