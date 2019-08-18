package mockInterview;

public class NumberOfLetters {
    public static void main(String[] args) {

        String str = "Today is a good day";
        int counter = 0;
        String s = "";

        for(int i = 0; i < str.length(); i++){
            if(!s.contains(str.charAt(i) + "")){
                for(int j = 0; j < str.length(); j++){
                    if(str.charAt(i) == str.charAt(j)){
                        s += str.charAt(i)+ "";
                        counter++;
                    }
                }
            }else {
                continue;
            }
            System.out.println(str.charAt(i) + ": " + counter );
            counter = 0;
        }



    }
}
