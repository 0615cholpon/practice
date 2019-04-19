package Methods;

public class myCollection {
	public static void main(String[] args) {
		int [] nums = {23, 53, -4, 23, -785, 1};
		printNegativeNum(nums);
	}
	public static void printNegativeNum(int [] numbers) {
		for(int nums: numbers) {
			if(nums < 0) {
				System.out.println(nums);
			}
		}
	}

}
