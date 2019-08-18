package mockInterview;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int [] num = {2, 5, 2, 8, 9, 9};
        duplicateNumbers(num);
    }
    public static void duplicateNumbers(int []nums){
        String duplicate = "";
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    duplicate += nums[i];
                }
            }
        }
        System.out.println(Integer.valueOf(duplicate));
    }

}
