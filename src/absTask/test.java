package absTask;

public class test {

    public static void main(String[] args) {
        int []nums = {2, 4, 99, 8};
        int max = nums[0];
        int secMax = nums[0];
        int temp = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                temp = max;
                max = nums[i];
                secMax = temp;
            }

            if(nums[i] > secMax && nums[i] != max){
                secMax = nums[i];
            }
        }
        System.out.println(secMax);
    }

}
