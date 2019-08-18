package ocaExam;

public class Test {
    public static void main(String[] args) {
        int [] numbers = {1000, 12, 13, 42, 32, 156};
        //int max = findMax(numbers);
        System.out.println(findMax(numbers));
    }
    public static int findMax(int [] numbers){
        int max = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}
