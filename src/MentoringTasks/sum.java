package MentoringTasks;

public class sum {
	public static void main(String[] args) {
		int [] nums = {1, 2, 5, 8, 9, 10};
		int max = 0;
		int min = 0;
		double sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}else if(nums[i] < min) {
				min = nums[i];
			}
		}
		sum = (sum - min - max) / nums.length;
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
	}

}
