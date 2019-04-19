package ForEachLoop;

public class IncrementArrayValues {
	public static void main(String[] args) {
	int nums [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	for(int numbers: nums) {
		System.out.print(numbers + " ");
	} for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] % 2 == 0) {
				nums[i] = nums [i] * 2;
					
			}else if(nums[i] % 2 == 1) {
				nums[i] = nums[i] * 3;
				
			}
}
	System.out.println();
	for(int numbers: nums) {
		System.out.print(numbers + " ");
	}	
		
		}
	
	
	
	
	
	
}
