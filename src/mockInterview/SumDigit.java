package mockInterview;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println(digitSum(23));
    }
    public static int digitSum(int num){
        int sum = 0;
      String conNum = Integer.toString(num);
      String []convert = conNum.split("");
      for(int i = 0; i < convert.length; i++){
          sum += Integer.valueOf(convert[i]);
      }
      return sum;
    }
}
