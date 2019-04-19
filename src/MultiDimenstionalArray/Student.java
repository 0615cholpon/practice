package MultiDimenstionalArray;

import java.util.Arrays;

public class Student {
	public static void main(String[] args) {
		String [][] groups = new String[3][];
		// Task: three String arrays - 3 groups
		// 1st array size of 2; 2nd array size of 5; 
		// 3rd array size of 4;
		// Give names for all elements
	String [] team3 = {"Adam", "Josh"};
	String [] team2 = {"Benzema", "Bale", "Modric", "Kaylor", "Marcelo"};
	String [] team1 = {"Messi", "Busquests", "Suarez", "Dembele"};
	groups[0] = team1; // or we can make new String[]{"Adam", "James"};
	groups[1] = team2;
	groups[2] = team3;
	// print Suarez and Adam
	System.out.println(groups[1][0].charAt(0));
	System.out.println(groups[0][2]);
	System.out.println(groups[2][0]);
	// print all teams using Arrays toString method
//	System.out.println(Arrays.toString(groups[0]));
//	System.out.println(Arrays.toString(groups[1]));
//	System.out.println(Arrays.toString(groups[2]));
	// print each teams memebers using Arrays toString and usiing loop.
	
	for(int i = 0; i < groups.length; i++) {
		//System.out.println(Arrays.toString(groups[i]));
		for(int k = 0; k < groups[i].length; k++) {
			System.out.print(groups[i][k] + " ");
		}
		//print the size of each inner array
		//System.out.println(groups[i].length);
		System.out.println();
		
	}

	
	}

}
