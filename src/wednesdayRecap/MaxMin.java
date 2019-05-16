package wednesdayRecap;

import java.util.Arrays;

public class MaxMin {
	public static void main(String[] args) {
		int[]numbers = {15, -25, 33, 35, 66, 44, 78, 95, 98, 1, 500};
		Arrays.sort(numbers);
		System.out.println("min grade:" + numbers[0]);
		System.out.println("max grade: " + numbers[numbers.length-1]);
		System.out.println();
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] <= min) {
				min = numbers[i];
			
			}else if(numbers[i] >= max ) {
				max = numbers[i];
				
			}
		}
		System.out.println("Max grade: " + max);
		System.out.println("Min grade: " + min);
	}

}
