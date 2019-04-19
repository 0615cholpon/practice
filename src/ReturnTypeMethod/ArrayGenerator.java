package ReturnTypeMethod;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {
	public static void main(String[] args) {
		int [] numbers = arrayOfIntegeres(5, 50);
		System.out.println(Arrays.toString(numbers));
	}
public static int [] arrayOfIntegeres(int size, int bound) {
int [] arrayNum = new int [size];
Random random = new Random();
for(int i = 0; i < arrayNum.length; i++) {
	arrayNum[i] = random.nextInt(bound);
}
return arrayNum;

   
   
}
}