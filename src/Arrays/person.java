package Arrays;

import java.util.Arrays;

public class person {
	public static void main(String[] args) {
		int [] ages = new int [5];
		ages[0] = 0;
		ages[4] = 65;
		ages[1] = 45;
		ages[2] = 3;
		ages[3] = 27; // We can reassign the value of the variable;
		//order of arrays don't mean anything. It will show by orders!No duplicate indexes;
		
//		System.out.println(Arrays.toString(ages)); // becomes String;
//		String []names = new String[4]; // should give the size immediately while creating the String, int etc.
//		names[0] = "Cholpon";
//		names [1] = "Aigul";
//		names [2] = "Murzabek";
//		names [3] = "Amir";
		
		//System.out.println(names[1]);
		//System.out.println(names[2]);
		//System.out.println(names[1] + " " + names[2]); //it will show in one line;
		
	String[] names = {"James", "Albina", "Chopa", "Bond"};
	System.out.println(Arrays.toString(names));
		
		double[]prices = {45.99, 23.5, 11.50, 33.33, 99.99}; //change the last index
		System.out.println(Arrays.toString(prices));
		prices[4] = 112.89;
		System.out.println(Arrays.toString(prices));
		// length --> this returns an integer that is a size of array!
		System.out.println(prices.length);
int []numbers = new int[] {34, 23, 65}; //shouldn't forget putting the size while initializing the value of the variable;
	
	}

}
