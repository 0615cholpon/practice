package MultiDimenstionalArray;

import java.util.Arrays;

public class intArray {
	public static void main(String[] args) {
int [][] numbers = {{23, 12, 65, 35, 57}, {23, 45, 65, 78, 20}, {12, 99, 78, 87, 58}, {33, 45, 29, 31, 43}};

	for(int i = 0; i < numbers.length; i++) {
		
			for(int k = 0; k < numbers[i].length; k++) {
				System.out.print(numbers[i][k] + " ");	
			}
			
			System.out.println();
	}
	
	
	}

}
