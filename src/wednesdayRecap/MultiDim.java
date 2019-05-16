package wednesdayRecap;

import java.util.Arrays;

public class MultiDim {
	public static void main(String[] args) {
		int[][]numbers = { 
				{1, 2, 3, 4, 5},
				{2, 4, 5, 8, 9},
				{5, 8, 6, 1, 0},
				{2, 3, 4, 2, 1}
				 };
		test(numbers, 3, 4);
//		for(int row = 0; row < numbers.length; row++) {
//			for(int col = 0; col < numbers[row].length; col++) {
//				System.out.print(numbers[row][col] + "\t");
//
//			}
//			System.out.println("");
//		}
	}
	public static void test(int [][] check, int row, int col) {
		System.out.println("Element at row " + row + ", element at column " + col + " is: " + check[row][col]);
		
	}

}
