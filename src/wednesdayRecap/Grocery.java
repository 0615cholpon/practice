package wednesdayRecap;

import java.util.Arrays;

public class Grocery {
	public static void main(String[] args) {
		String[]groceryList = {"apple", "carrot", "orange", "cherry", "strawberry"};
		Arrays.sort(groceryList);
		
	
			System.out.println("index number of apple is: "  + Arrays.binarySearch(groceryList, "apple"));
			System.out.println("index number of orange is: " + Arrays.binarySearch(groceryList, "cherry"));
	}

}
