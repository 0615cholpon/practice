package ForEachLoop;

public class EvenCollector {
	public static void main(String[] args) {
		int [] nums = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.print(nums[i] + " ");	
			}
		}
	}

}
