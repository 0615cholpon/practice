package MethodOverloading;

import java.util.Arrays;

public class ownArray {
	public static void main(String[] args) {
		String [] word = {"Apple", "cat", "ball"};
		String total = arrayString(word);
	    System.out.println(total);
	    
	    int [] numbers = {10,20, 40, 60};
	    System.out.println(arrayString(numbers));
		
	}
	public static String arrayString(String [] arr) {
		String  newArr ="["; 
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				newArr += arr[i] + "]";
			}else {
				newArr += arr[i]+ ", ";
			}
			
		}
		return newArr;
		 
	}
	public static String arrayString(int [] nums) {
		String  newArr ="["; 
		for(int i = 0; i < nums.length; i++) {
			if(i == nums.length-1) {
				newArr += nums[i] + "]";
			}else {
				newArr += nums[i]+ ", ";
			}
			
		}
		return newArr;
	}
}
