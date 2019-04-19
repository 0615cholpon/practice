package replit;

import java.util.Arrays;

public class DeleteArrayNum {
public static void main(String[] args) {
	int [] nums = {12, 23, 1, 6};
	System.out.println(Arrays.toString(deleteR(nums, 6)));
//		System.out.println(Arrays.toString(nums));
//		newV[0] = arr[0]; 12
//		newV[1] = arr[1]; 23
//		
//		newV[] = arr[2]; 1 xxxx
//		newV[2] =arr[3]; 6
		
	}
public static int[] deleteR(int[] arr,int element) {
	int [] newV = new int[arr.length - 1];
	int a = 0;
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] != element) {
			newV[a] = arr[i];
			a++;
//			System.out.println(newV + " ");
		}
		else {
			continue;
		}
	}
	return newV;
		  
	  }
}
