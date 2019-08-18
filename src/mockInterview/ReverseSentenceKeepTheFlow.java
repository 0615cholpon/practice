package mockInterview;

public class ReverseSentenceKeepTheFlow {
    public static void main(String[] args) {
        String word = "I love java";
        String [] wordSplit = word.split(" ");
        String reversedOne = "";

        for(int i = 0; i < wordSplit.length; i++){
            for(int j = wordSplit[i].length() -1; j >= 0; j--){
                reversedOne += wordSplit[i].charAt(j);
            }
            reversedOne += " ";
        }
        System.out.println(reversedOne + " ");
    }
}
