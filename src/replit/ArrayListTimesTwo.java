package replit;

import java.util.ArrayList;

public class ArrayListTimesTwo {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(5);
		nums.add(2);
		nums.add(4);
		
		
		
	}
	public void timesTwo(ArrayList<Integer> nums) {
		ArrayList<Integer>totalNum = new ArrayList<>();
		int result = 0;
		for(int i = 0; i < nums.size(); i++) {
			int element = nums.get(i);
			result = element * 2;
			totalNum.add(result);
		}
		System.out.println(result);
	}

}
