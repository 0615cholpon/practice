package replit;

import java.util.Arrays;

public class AddElement {
	public static void main(String[] args) {
		int []nums = {12, 3, 4, 5};
		int []num = {12, 3, 4, 5};
		System.out.println(Arrays.toString(addElements(num, nums)));
	}
public static int[] addElements(int[] ints1, int[] ints2) {
	int []newArr = new int [ints1.length];
	for(int i = 0; i < newArr.length; i++) {
		newArr[i] = ints1[i] + ints2[i];
	}
      return newArr;
}
}
