package MultiDimenstionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDAString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of groups:");
		int numGroups = input.nextInt();
		
		
		String [][] groups = new String[numGroups][];
		int counter = 1;
		for(int i = 0; i < groups.length; i++) {
			System.out.println("Please enter number of students for group " + (i+1)+ ":");
			int numSts = input.nextInt();
			input.nextLine();
			String [] group = new String[numSts];
        for(int j = 0; j < group.length; j++) {
        	System.out.println("Please enter student name: "  + (j+1) + ":");
			group[j] = input.nextLine();
			
			}	
			groups[i] = group;	
			}
			
			System.out.println(Arrays.deepToString(groups));
		}
		
		
	}


