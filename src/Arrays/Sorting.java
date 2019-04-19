package Arrays;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int [] ages = {28, 32, 4, 5, 12, 65, 59};
		System.out.println(Arrays.toString(ages));
		Arrays.sort(ages);
		System.out.println(Arrays.toString(ages));
		
		String [] alphabets = {"A","D","Z","O"};
		System.out.println(Arrays.toString(alphabets));
		Arrays.sort(alphabets);
		System.out.println(Arrays.toString(alphabets));
		
		
		String [] cars = {"Mercedes", "BMW", "AMG", "ZENDA", "Lexus"};
		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));
		
	}

}
