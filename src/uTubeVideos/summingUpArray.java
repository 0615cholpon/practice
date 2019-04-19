package uTubeVideos;

public class summingUpArray {
	public static void main(String[] args) {
		int[] numbers = {2, 4, 5, 10, 3};
		int sum = 0;
		int max = numbers[0];
		int min = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			sum += numbers[i];
			if(numbers[i] > max) {
				max = numbers[i];
			}else if(numbers[i] < min) {
			
			}	
		}
		System.out.println();
		System.out.println("Maximum number is: " + max);
		System.out.println("Minimum number is: " + min);
		System.out.println("Sum of the array is: " + sum);
	}

}
