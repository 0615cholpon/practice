package mockInterview;

public class SecondMax {
    public static void main(String[] args) {
        int[] nums = {2, 4, 10, 99};
        int max = nums[0];
        int secondMax = nums[0];
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                temp = max;
                max = nums[i];
                secondMax = temp;
            }
        }
        System.out.println(secondMax);
    }
}