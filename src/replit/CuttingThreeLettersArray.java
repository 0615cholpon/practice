package replit;

import java.util.Arrays;
import java.util.Scanner;

public class CuttingThreeLettersArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++){
			arr[i] = input.nextLine();
			if(arr [i].length() >= 3) {
			arr [i] =(arr[i].substring(0, 3));	
			}
			System.out.println(arr[i]);
		}
	
	
		
		
	
	
	}

}
