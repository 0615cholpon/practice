package replit;

import java.util.Arrays;

public class ScalarMatrix {
	public static void main(String[] args) {
		int [][] matrix = {{1, 2, 3},{3, 4, 5}};
		System.out.println(Arrays.deepToString(scalar(matrix, 2)));
	}
	  public static int[][] scalar(int[][] matrix ,int n){
		 // int [][]newArr;
		  for(int i = 0; i < matrix.length; i++) {
			  for(int j = 0; j < matrix[i].length; j++) {
				  matrix[i][j] = matrix[i][j] * n;
			  }
		  }
		  return matrix;
		  
	  }

}
