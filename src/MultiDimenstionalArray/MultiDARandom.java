package MultiDimenstionalArray;

import java.util.Arrays;
import java.util.Random;

public class MultiDARandom {
	public static void main(String[] args) {
		int [][] n = RanNum(3, 5);
		System.out.println(Arrays.deepToString(n));
		
		// OR
		// for (int i: n){
		//  Syste.out.println(Arrays.toString(i);}
	}
	public static int [][] RanNum (int size1, int size2){
		int [][] numbers = new int [size1][size2];
		Random random = new Random();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = random.nextInt(100);
			}
		}
		return numbers;
		
	}

}
