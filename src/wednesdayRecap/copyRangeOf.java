package wednesdayRecap;

import java.util.Arrays;
import java.util.Scanner;

public class copyRangeOf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to divide my array");
		System.out.println("Enter a number that will be the size of your array:");
		int number = input.nextInt();
	
		int[]arrayNumber = new int[number];
		System.out.println("Enter the number that will be the elements of the array:");
		for(int i = 0; i < number; i++) {
		arrayNumber[i] = input.nextInt();
		}
		System.out.println("The String value of the array is: " + Arrays.toString(arrayNumber));
        int []firstHalf = Arrays.copyOfRange(arrayNumber, 0, number/2);
        int []secondHalf = Arrays.copyOfRange(arrayNumber, number/2, number);
	    System.out.println("The first half of the array is: " + Arrays.toString(firstHalf));
	    System.out.println("The second half of the array is: " + Arrays.toString(secondHalf));
	
			
		
		
	}

}
