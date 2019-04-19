package ForEachLoop;

import java.util.Arrays;

public class EvenCollector1 {
	public static void main(String[] args) {
		int [] nums = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
		int counter = 0;
		for(int numbers: nums) {
			if(numbers % 2 == 0) {
				counter++;
			}		
		}
		int [] evenNumbers = new int [counter];
		int i = 0;
		for(int numbers: nums) {
			if(numbers % 2 == 0) {
			evenNumbers[i] = numbers;
			i++;
		}
	}
System.out.println(Arrays.toString(evenNumbers));
}
}