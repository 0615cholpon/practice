package mockInterview;

public class FactorialNum {
    public static void main(String[] args) {
        System.out.println(factNumber(4));
    }
    public static int factNumber(int num){
      int result = 1;
      for(int i = num; i >= 1; i--){
          result *= i;
      }
      return result;
    }
}
