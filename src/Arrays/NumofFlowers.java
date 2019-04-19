package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumofFlowers {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("How many types of flowers do you have: ");
		int flowerTypesNum = input.nextInt();
		
		String [] myFlowers = new String[flowerTypesNum];
		
		
		for(int i = 0; i < flowerTypesNum; i++) {
			myFlowers[i] = "Rose";
				
		}
		System.out.println(Arrays.toString(myFlowers));
	}

}
