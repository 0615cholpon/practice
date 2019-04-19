package MentoringTasks;

public class averageOfArray {
	public static void main(String[] args) {
		int [] nums = {1, 2, 5, 8, 9, 10};
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			
		}
		sum = sum / nums.length;
		System.out.println(sum);
		
	}

}
