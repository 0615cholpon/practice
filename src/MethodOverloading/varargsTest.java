package MethodOverloading;

public class varargsTest {
	public static void main(String[] args) {
		maxValue(-12, -34, -56, -90);
	}
	public static void  maxValue(int ... numbers) {
		
	int maxElement = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > maxElement) {
				maxElement = numbers[i];
			}
			
		}
		System.out.println(maxElement);
	}

}
