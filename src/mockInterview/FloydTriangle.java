package mockInterview;

public class FloydTriangle {
    public static void main(String[] args) {
        int num = 0;
        int nums = 10;
        for(int i = 1; i <= nums; i++){
             if(num == nums){
                 break;
             }
            for(int j = 0; j < i; j++){
                num++;
                System.out.print(num + " ");

            }

            System.out.println();
        }
    }
}
