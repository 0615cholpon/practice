package mockInterview;

import MentoringTasks.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String [] words = {"apple", "dog", "cup", "flower"};


        for(int i = 0; i < words.length/2; i++){
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 -i] = temp;

        }

        System.out.println(Arrays.toString(words));
    }

}
