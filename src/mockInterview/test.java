package mockInterview;

public class test {
    public static void main(String[] args) {
        String test = "Today is sunny";
        String []testSplit = test.split(" ");
        String reversed = "";

        for(int i = 0; i < testSplit.length; i++){
            for(int j = testSplit[i].length() -1; j >= 0; j--){
                reversed += testSplit[i].charAt(j);
            }
            reversed += " ";
        }
        System.out.println(reversed);
    }
}
