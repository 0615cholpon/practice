package MentoringTasks;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		int [] nums = {0, 3, 5, 17, 0, -28, 0, 0, 9, 13, 9};
		int numIndex = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]!= 0) {
				int tempNum = nums[i];
				nums[i] = nums[numIndex];
				nums[numIndex] = tempNum;
				numIndex++;
			}
			
		}
		System.out.println(Arrays.toString(nums));
	}

}
