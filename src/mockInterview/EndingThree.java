package mockInterview;

public class EndingThree {
    public static void main(String[] args) {
        int []nums = {25, 53, 63, 20, 83};
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 10 == 3){
                System.out.println(nums[i]);
            }
        }
    }
}
