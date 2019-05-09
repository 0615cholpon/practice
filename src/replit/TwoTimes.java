package replit;

import java.util.ArrayList;

public class TwoTimes {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
	System.out.println(twoTimes(nums));
		
	}
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < nums.size(); i++) {
			numbers.add(nums.get(i));
			numbers.add(nums.get(i));
			
		}
		return numbers;
		
		
	}

}
