package MultiDimenstionalArray;

import java.util.Arrays;

public class SumofMaxArray {
	public static void main(String[] args) {
int [][] numbers = {{23, 12, 65, 35, 57}, {23, 45, 65, 78, 20}, {12, 99, 78, 87, 58}, {33, 45, 29, 31, 43}};

int max = 0;
for(int [] i: numbers) {
	int sum = 0;
	for(int b: i) {
		sum += b;	
	}
	if(sum > max) {
		max = sum;
	}
}
System.out.println(max);
}




	}


