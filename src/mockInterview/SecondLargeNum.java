package mockInterview;

import MentoringTasks.Array;

public class SecondLargeNum {
    public static void main(String[] args) {
        int [] nums = {12, 3, 99 ,1, 100, 100};
        System.out.println(secBigNum(nums));
    }
    public static int secBigNum(int []num){
     int max = num[0];
     int secondMax = num[0];

     for(int i = 0; i < num.length; i++){
        if(num[i] > max){
            secondMax = max;
            max = num[i];
        } else if(num[i] > secondMax && num[i] != max){
            secondMax = num[i];
        }
     }
        return secondMax;
    }
}
