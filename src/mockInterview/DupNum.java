package mockInterview;

public class DupNum {
    public static void main(String[] args) {
        int [] nums = {1, 3, 3, 8, 9, 2, 2};
        for(int i = 1; i < nums.length; i++){
            if(nums[i -1] == nums[i]){
                System.out.println("Duplicate number: " + nums[i]);
            }
        }
    }
}
