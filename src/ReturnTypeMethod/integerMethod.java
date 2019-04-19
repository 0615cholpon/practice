
package ReturnTypeMethod;

import java.util.Arrays;

public class integerMethod {
	public static void main(String[] args) {
	int [] total =	{10, 20, 13, 25, 67, 90};
	System.out.println(Arrays.toString(total));
	System.out.println(num(total));
	}


public static int num(int [] numbers) {
	int sum = 0;
	for(int i = 0; i < numbers.length; i++) {
		
	if(numbers[i] %2 == 0)
		
		sum ++;	
		
	}
	return sum;
	
}
}