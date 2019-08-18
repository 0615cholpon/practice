package test;

import MentoringTasks.Array;

public class test1 {
    public static void main(String[] args) {
        System.out.println("Hello world ggggg");

        int[]nums = {1, 2, 3, 4};
        int count = 0;

        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] == 2 && nums[i - 1] == 2 && i !=0){
                count++;
            }
        }

            if(count > 0){
                System.out.println("same");
            }
            else{
                System.out.println("not same");
            }


    int [] count1 = {-2, 4, 5, 6};

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i = 0; i < count1.length; i++){
                if(count1[i] > max){
                    max = count1[i];
                }
                if(count1[i]< min){
                    min = count1[i];
                }

            }
        System.out.println("Max: " + max + " " + " Min: " + min);


    }




    }

