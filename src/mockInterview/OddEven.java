package mockInterview;

public class OddEven {
    public static void main(String[] args) {
        int [] num = {12, 4, 8, 3, 9, 5};
        evenOdd(num);
    }
    public static void evenOdd(int []num){
        String even = "";
        String odd = "";
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                even += num[i] + " ";
            }else{
                odd += num[i] + " ";
            }
        }
        System.out.print(even);
        System.out.println();
        System.out.println(odd);
    }
}
