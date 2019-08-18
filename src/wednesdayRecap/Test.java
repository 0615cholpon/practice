package wednesdayRecap;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String word = "mom dad good dad good dad";
        String [] wordSplit = word.split(" ");
        //System.out.println(Arrays.toString(wordSplit));
        String container = "";

        for(int i = 0; i < wordSplit.length; i++) {
            for (int j = i + 1; j < wordSplit.length; j++) {
                if (wordSplit[i].equalsIgnoreCase(wordSplit[j])) {
                    container += wordSplit[i] + " ";

                }

            }
        }
        System.out.println(container);

    }
}
