package mockInterview;

public class PrintUniqueFirst {
    public static void main(String[] args) {
        String word = "civic";
        String container = "";
        for(int i = 0; i < word.length(); i++){
            for(int j = i + 1; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    container += word.charAt(i);
                }
            }
        }
        System.out.println(container.substring(0,1));
    }
}
