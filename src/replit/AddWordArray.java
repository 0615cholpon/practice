package replit;

import java.util.Arrays;

public class AddWordArray {
	public static void main(String[] args) {
		String []array = {"Hello", "how", "are", "you?"};
		System.out.println(Arrays.toString(addWordArray("hope", array)));
	}
	public static String[] addWordArray(String word, String[] array) {
		  String [] new_arr = new String[array.length + 1];
		  new_arr[0] = word;
		  for(int i = 1; i < new_arr.length; i++) {
			  new_arr[i] = array[i - 1];
		  }
			
			 return new_arr;
		  }
}