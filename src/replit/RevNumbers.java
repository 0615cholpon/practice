package replit;

import java.util.Arrays;
import java.util.Scanner;

public class RevNumbers {
	public static void main(String[] args) {
		  
 Scanner input = new Scanner(System.in);
 int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
			    
			    //TODO: write your code below
	int temp = 0;
	for(int i = 0; i < nums.length/2; i++) {
		temp = nums[i];
		nums[i] = nums[nums.length-1 - i];
		nums[nums.length -1 - i] = temp;
	}
			    
			    //Do not change below statement:
			    System.out.println(Arrays.toString(nums));
			    
			  }
			
	}


