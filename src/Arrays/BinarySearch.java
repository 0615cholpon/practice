package Arrays;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
//		int [] numbers = {45, 23, 6, -3, 66}; //Searching for - 3 & considered to be the worst case sentario;
//    for(int i = 0; i < numbers.length; i ++) {
//	if(numbers[i] == -3) {
//		System.out.println(i);
//		break;
//	}
//}
		int [] numbers = {45, 23, 6, -3, 66};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
//Before searching for specific indexes, we need to sort our array first!
		int result = Arrays.binarySearch(numbers, -3);
		System.out.println(result);
		}
	}


