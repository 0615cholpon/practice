package replit;

public class SecMax {
	public static void main(String[] args) {
		int [] nums = {1, 2, 3, 4, 34, 12, 11};
		System.out.println(secLargestOne(nums));
		
	}
	public static int secLargestOne(int [] arr) {
		int max = arr[0];
		int secondMax =arr[0]; 
		// [1, 2, 3, 4, 34, 12, 11]
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				secondMax = max;
				max=arr[i];
			} else if(arr[i]>secondMax&& arr[i]!=max) {
				secondMax = arr[i];
			}
		
			
		}
		
		return secondMax;
	}

}
