package teamTask;

public class SecLargeNum {
	public static void main(String[] args) {
		int [] nums = {25, 65, 78, 27, 90};
		System.out.println(secondLargestNumber(nums));
		
	}
public static int secondLargestNumber (int [] arr) {
        
        int max = arr[0];
        int secondMax = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max=arr[i];
            }
        }
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] > secondMax && arr[j] < max) {
                secondMax = arr[j];
            }
        }
        return secondMax;
    }
}
