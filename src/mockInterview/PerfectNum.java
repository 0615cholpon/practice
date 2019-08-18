package mockInterview;

public class PerfectNum {
    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }
    public static boolean isPerfect(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
           if(num % i == 0){
               sum += i;
           }
        }
        if(sum == num){
            return true;
        }

        return false;
    }
}
