package mockInterview;

public class SkipThirteenAndNext {
    public static void main(String[] args) {
        int [] numbers = {2, 3, 13, 65, 4};
        int skip = 0;
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(skip > 0){
                skip = 0;
                continue;
            }
            if(numbers[i] == 13 && i != numbers.length -1){
                skip++;
                continue;
            }else{
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
