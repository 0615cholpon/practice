package replit;

public class IsSorted {
	public static void main(String[] args) {
		int [] nums = {2, 3, 5, 4, 9};
		System.out.println(isSort(nums));
	}
	public static boolean isSort(int [] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > nums[i + 1]) {
				return false;
			}
			//return true;
		}
		return true;
		
	}

}
