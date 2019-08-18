package mockInterview;

public class ArrayCommonElements {
    public static void main(String[] args) {
        String[] str1 = {"apple", "test", "school", "test"};
        String[] str2 = {"apple", "bag", "pen", "test"};

        System.out.println(commonElements(str1, str2));
    }
    //Write a java program to find common elements between two arrays in java?
    public static String commonElements(String[] str1, String[]str2){
        String element = "";
        for(int i = 0; i < str1.length; i++){
            for(int j = 0; j < str2.length; j++){
                if(str1[i].equalsIgnoreCase(str2[j])){
                    element += str1[i] +" ";
                }
            }
        }
        return element;
    }
}
