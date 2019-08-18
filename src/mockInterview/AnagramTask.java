package mockInterview;

import MentoringTasks.Array;

import java.util.Arrays;

public class AnagramTask {
    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen"));
    }
    public static boolean isAnagram(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }

        char [] charLetter = word1.toCharArray();
        char [] charLetter1 = word2.toCharArray();
        Arrays.sort(charLetter);
        Arrays.sort(charLetter1);

        for(int i = 0; i < word1.length(); i++){
            if(charLetter[i] != charLetter1[i]){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
}
