package MultiDimenstionalArray;

import java.util.Arrays;

public class BigArray {
	public static void main(String[] args) {
	int [][] numbers = {{23, 12, 65, 35, 57}, {23, 45, 65, 78, 20}, {12, 400, 78, 87, 58}, {33, 2, 29, 31, 43}};
		highSum(numbers);
	}
	public static void highSum(int [][] num) {
		int highArray = Integer.MIN_VALUE;
	//	int sum = 0;
		int index = 0;
		int sum = 0;
		for (int i = 0; i < num.length; i++) { // i --> index of inner array
			                                   // j --> index of inner array's elements
			 sum = 0;
			for (int j = 0; j < num[i].length; j++) {
					sum += num[i][j];	
		}
			if(sum > highArray) { // index of array is "i";
				highArray = sum;
				index = i;
				
			}
	}
	System.out.println(Arrays.toString(num[index]));	
		
	}

}
