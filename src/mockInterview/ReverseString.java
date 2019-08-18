package mockInterview;

public class ReverseString {
    public static void main(String[] args) {
        //Write a java program to reserve string without using api?
        String word = "test";
        word = word.trim();
        String temp = "";
        for(int i = word.length() - 1; i >= 0; i--){
           temp += word.charAt(i);
        }
        System.out.println(temp);
    }
}
