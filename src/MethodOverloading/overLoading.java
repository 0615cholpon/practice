package MethodOverloading;

import java.util.Arrays;

public class overLoading {
	public static void main(String[] args) {
		String [] words = {"snow", "school", "Cat"};
		String [] total = addArray(words, "copy", 2);
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
	public static String [] addArray(String [] arr, String insert, int index) {
		String [] newarr2 = new String [arr.length +1]; 
		int in = 0;
		for(int i = 0; i < newarr2.length; i++) {
			
			if(i == index) { //imagine it's index 2;
				newarr2[i] = insert;
			}else {
				newarr2[i] = arr[in];
				in++;
			}
				
			}
		return newarr2;
			
		}
	
		
	}	
