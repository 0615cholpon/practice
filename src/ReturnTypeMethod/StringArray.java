package ReturnTypeMethod;

import java.util.Arrays;

public class StringArray {
	public static void main(String[] args) {
		String [] newW = {"Hi", "World", "See", "You"};
		String [] total = addArray(newW, "Soon");
		System.out.println(Arrays.toString(total));
	}
	public static String [] addArray(String[] arr, String word) {
		String [] new_arr = new String[arr.length+1];
		for(int i = 0; i < arr.length; i++) {
			new_arr[i] = arr[i];
			
		}
		new_arr[new_arr.length -1] = word;
		return new_arr;
	}

}
