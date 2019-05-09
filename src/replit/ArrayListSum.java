package replit;

import java.util.ArrayList;

public class ArrayListSum {
	public static void main(String[] args) {
		ArrayList<Integer>ints = new ArrayList<>();
		ints.add(12);
		ints.add(1);
		ints.add(2);
		int sum = 0;
		
		for(int i = 0; i < ints.size(); i++) {
			sum += ints.get(i);
		}
		System.out.println(sum);
	}

}
