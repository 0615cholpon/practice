package mockInterview;

public class ReverseWholeSentence {
    public static void main(String[] args) {
        String sentence = "I love programming";
        sentence = sentence.trim();
        String[]sentSplit = sentence.split(" ");
        String reversed = "";

        for(int i = 0; i < sentSplit.length; i++){
            for(int j = sentSplit.length - 1; j >= 0; j--){
                reversed += sentSplit[i].charAt(j);
            }
        }
        System.out.println(reversed);

    }
}
