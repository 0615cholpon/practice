package replit;

import java.util.ArrayList;

public class ArrayListAppendPosSum {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(-1);
		nums.add(2);
		nums.add(3);
		nums.add(-27);
		nums.add(46);
		System.out.println(appendPosSum(nums));
		
	}
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
		int sum = 0;
	ArrayList<Integer>totsum = new ArrayList<>();
	for(int i = 0; i < nums.size(); i++) {
		if(nums.get(i) > 0) {
			
			totsum.add(nums.get(i));
			sum += nums.get(i);
			
		}
	}
	totsum.add(sum);
	return totsum;
	}

}
